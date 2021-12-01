package com.csi.controller;

import com.csi.exception.RecordNotFoundException;
import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import com.csi.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

@Autowired
EmployeeService employeeService;

@Autowired
EmployeeRepository employeeRepository;



@PostMapping("/savedata")
    public Employee saveData(@RequestBody Employee employee)
{
    return  employeeService.saveData(employee);
}

@GetMapping("/getalldata")
    public List<Employee> getAllData(){
    return  employeeService.getAllData();
}

@GetMapping("/getdatabyempdob/{empDOB}")
    public Employee getDataByDOB(@PathVariable String empDOB){

    return employeeService.getDataByDOB(empDOB);
}

@PutMapping("/updatedata/{empId}")
    public Employee updateData(@PathVariable int empId, @RequestBody Employee employee) throws RecordNotFoundException {
  Employee emp=employeeRepository.findById(empId).orElseThrow(()->new RecordNotFoundException("Employee Id does not exit"));
    return  employeeService.updateData(employee);
}

}

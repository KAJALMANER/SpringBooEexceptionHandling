package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveData(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllData() {
        return employeeRepository.findAll();
    }

    public Employee getDataByDOB(String empDOB) {

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date employeeDOB=null;
        try {
            employeeDOB=simpleDateFormat.parse(empDOB);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return employeeRepository.findByEmpDOB(employeeDOB);

    }


    public Employee updateData(Employee employee) {
        return employeeRepository.save(employee);
    }
}

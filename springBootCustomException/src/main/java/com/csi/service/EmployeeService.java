package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee saveData(Employee employee) {
        return  employeeDao.saveData(employee);
    }

    public List<Employee> getAllData() {
        return  employeeDao.getAllData();
    }

    public Employee getDataByDOB(String empDOB) {
        return  employeeDao.getDataByDOB(empDOB);
    }

    public Employee updateData(Employee employee) {
        return employeeDao.updateData(employee);
    }
}

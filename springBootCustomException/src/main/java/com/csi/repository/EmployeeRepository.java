package com.csi.repository;

import com.csi.model.Employee;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


    public  Employee findByEmpDOB(Date empDOB);
}

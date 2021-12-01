package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String empName;
    private String empAddress;


    @JsonFormat(pattern = "dd-MM-yyyy",timezone ="Asia/Kolkata")
    @Temporal(TemporalType.DATE)
    private Date empDOB;


}

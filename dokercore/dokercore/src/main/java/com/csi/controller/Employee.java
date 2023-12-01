package com.csi.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int empId;

    private String empName;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDob;

    private double empSalary;

    private String empEmailId;

    private String empPassword;

}

package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class EmployeeController {



    @GetMapping("/findall")
    public List<Employee> findall() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Employee employee1 = new Employee(1,"amol",dateFormat.parse("13-12-1997"),45000,"beamolpatil@gmail.com","amo123");
        Employee employee2 = new Employee(2,"Rahul",dateFormat.parse("07-08-1995"),87000,"rahul@gmail.com","rahul71");
        Employee employee3 = new Employee(3,"Paresh",dateFormat.parse("05-05-2003"),75000,"paresh@gmail.com","paresh15");
        Employee employee4 = new Employee(4,"pawan",dateFormat.parse("06-08-2004"),25000,"pawan@gmail.com","pawan256");
        Employee employee5 = new Employee(5,"lalit",dateFormat.parse("08-04-2005"),63000,"lalit@gmail.com","lalit45");
        Employee employee6 = new Employee(6,"manoj",dateFormat.parse("02-01-2008"),98000,"manoj@gmail.com","manoj78");
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        return employeeList;
    }

    @GetMapping("/findbyid/{empId}")
    public Employee findbyid(@PathVariable int empId) throws ParseException {
        return findall().stream().filter(emp->emp.getEmpId()==empId).collect(Collectors.toList()).get(0);
    }

    @GetMapping("/findbyname/{empName}")
    public List<Employee> findbyName(@PathVariable String empName) throws ParseException {
        return findall().stream().filter(emp->emp.getEmpName().equals(empName)).collect(Collectors.toList());
    }


}

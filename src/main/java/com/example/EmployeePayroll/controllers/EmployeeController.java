package com.example.EmployeePayRoll.controllers;

import com.example.EmployeePayRoll.dto.EmployeeDTO;
import com.example.EmployeePayRoll.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //UC1 --> CRUD operations on employee database through REST API
    @GetMapping("/get/{id}")
    public EmployeeDTO get(@PathVariable Long id){
        return employeeService.get(id);
    }

    @PostMapping("/add")
    public EmployeeDTO create(@RequestBody EmployeeDTO newEmp){
        return employeeService.create(newEmp);
    }

    @PutMapping("/edit/{id}")
    public EmployeeDTO edit(@RequestBody EmployeeDTO emp, @PathVariable Long id){
        return employeeService.edit(emp, id);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return employeeService.delete(id);
    }

}

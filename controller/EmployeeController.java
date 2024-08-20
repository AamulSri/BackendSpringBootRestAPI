package com.ctrlcrafting.hello.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.ctrlcrafting.hello.dto.EmployeeDTO;
import com.ctrlcrafting.hello.services.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path ="/employee")
public class EmployeeController {

    final EmployeeService empService;

    public EmployeeController(EmployeeService empService){
        this.empService =  empService;
    }

    @GetMapping(path ="/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long empID) {
        return empService.getEmployeeById(empID);
    }
    
    @GetMapping
    public List<EmployeeDTO> getAllEmp() {
        return  empService.getAllEmp();
    }
    

    @PostMapping
    public EmployeeDTO createNewEmployeeData(@RequestBody EmployeeDTO empDTO) {
       return empService.createNewEmployeeData(empDTO);
    }

    @DeleteMapping(path ="/{id}")
    public boolean deleteEmpolyee(@PathVariable("id") Long empID){
        return empService.deleteEmployeeData(empID);
    }
    

   
    

}

package com.ctrlcrafting.hello.services;

import java.util.*;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.ctrlcrafting.hello.dto.EmployeeDTO;
import com.ctrlcrafting.hello.entities.EmployeeEntity;
import com.ctrlcrafting.hello.repositiories.EmployeeRepo;

@Service
public class EmployeeService {

final EmployeeRepo employeeRepo;
final ModelMapper modelmapper;   

  public EmployeeService(EmployeeRepo employeeRepo, ModelMapper modelmapper){
    this.employeeRepo = employeeRepo;
    this.modelmapper = modelmapper;
  }

    public EmployeeDTO getEmployeeById(Long id){
       EmployeeEntity empEntity = employeeRepo.getById(id);
       return modelmapper.map(empEntity , EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmp(){
       return
        employeeRepo.findAll().stream().map(empEntity->modelmapper.map(empEntity , EmployeeDTO.class)).
        collect(Collectors.toList());
    }

    public EmployeeDTO createNewEmployeeData(EmployeeDTO empDTO) {
        EmployeeEntity empEntity = modelmapper.map(empDTO , EmployeeEntity.class);
        return modelmapper.map(employeeRepo.save(empEntity),EmployeeDTO.class);

    }

    public boolean deleteEmployeeData(Long empID) {
        if(employeeRepo.existsById(empID)){
            employeeRepo.deleteById(empID);
            return true;
        }
        else{
            return false;
        }
    }
}

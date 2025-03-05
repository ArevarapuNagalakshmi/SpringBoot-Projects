package com.Employee.demo1.Controller;

import com.Employee.demo1.EmpDto.EmpDto1;
import com.Employee.demo1.Entity.Employees;
import com.Employee.demo1.Services.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    private DemoService service;

    @PostMapping("/saveEmployees")
    public ResponseEntity<EmpDto1> saveEmployees(@RequestBody EmpDto1 empDto1){
        EmpDto1 PE=service.saveEmployees(empDto1);
        return new ResponseEntity<>(PE,HttpStatus.CREATED);
    }
    @GetMapping("/{empId}")
    public ResponseEntity<EmpDto1> getEmployees(@PathVariable Long empId){
    EmpDto1 empDto1=service.getEmployees(empId);
        return new ResponseEntity<>(empDto1,HttpStatus.OK);
    }
    @PutMapping("/{empId}")
    public ResponseEntity<EmpDto1> updateEmployee(
            @PathVariable Long empId,
            @RequestBody EmpDto1 empDto1) {
        EmpDto1 updatedEmployee = service.updateEmployees(empId, empDto1);
        return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);
    }
    @DeleteMapping("/{empId}")
    public ResponseEntity<Employees>deleteEmployees(@PathVariable Long empId){
     Employees employees=service.deleteEmployees(empId);
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }




}

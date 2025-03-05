package com.Employee.demo1.Services;

import com.Employee.demo1.EmpDto.EmpDto1;
import com.Employee.demo1.Entity.Employees;

public interface DemoService {
    EmpDto1 saveEmployees(EmpDto1 empDto1);
    EmpDto1 getEmployees(Long empId);
    EmpDto1 updateEmployees(Long empId,EmpDto1 empDto1);
    Employees deleteEmployees(Long empId);
}

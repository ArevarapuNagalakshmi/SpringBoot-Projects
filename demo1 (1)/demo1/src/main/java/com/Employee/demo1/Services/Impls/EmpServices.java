package com.Employee.demo1.Services.Impls;

import com.Employee.demo1.EmpDto.EmpDto1;
import com.Employee.demo1.Entity.Employees;
import com.Employee.demo1.Repository.EmployeeRepo;
import com.Employee.demo1.Services.DemoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpServices implements DemoService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public EmpDto1 saveEmployees(EmpDto1 empDto1) {
        Employees E=new Employees(
                empDto1.getEmpId(),
                empDto1.getEmpName(),
                empDto1.getEmpSal(),
                empDto1.getEmpRole(),
                empDto1.getEmpCompany()
        );
        Employees saveemployees= (Employees) employeeRepo.save(E);
        EmpDto1 E1=new EmpDto1(
                saveemployees.getEmpId(),
                saveemployees.getEmpName(),
                saveemployees.getEmpSal(),
                saveemployees.getEmpRole(),
                saveemployees.getEmpCompany()
        );
        return E1;
    }

    @Override
    public EmpDto1 getEmployees(Long empId) {
        Employees Emp=employeeRepo.findByEmpId(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + empId));
        EmpDto1 E2=new EmpDto1(
                Emp.getEmpId(),
                Emp.getEmpName(),
                Emp.getEmpSal(),
                Emp.getEmpRole(),
                Emp.getEmpCompany()
        );
        return E2;
    }
    @Override
    public EmpDto1 updateEmployees(Long empId, EmpDto1 empDto1) {
        Employees emp = employeeRepo.findByEmpId(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + empId));
        emp.setEmpName(empDto1.getEmpName());
        emp.setEmpSal(empDto1.getEmpSal());
        emp.setEmpRole(empDto1.getEmpRole());
        emp.setEmpCompany(empDto1.getEmpCompany());
        Employees updatedEmp = employeeRepo.save(emp);

        return new EmpDto1(
                updatedEmp.getEmpId(),
                updatedEmp.getEmpName(),
                updatedEmp.getEmpSal(),
                updatedEmp.getEmpRole(),
                updatedEmp.getEmpCompany()
        );
    }

    @Override
    public Employees deleteEmployees(Long empId) {
      Employees employees=employeeRepo.findByEmpId(empId)
              .orElseThrow(()->new RuntimeException("The Employees are not Present:"+empId));
        employeeRepo.deleteById(empId);
        return employees;
    }


}

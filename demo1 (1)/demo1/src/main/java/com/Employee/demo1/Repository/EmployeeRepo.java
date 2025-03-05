package com.Employee.demo1.Repository;

import com.Employee.demo1.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employees,Long> {
    Optional<Employees> findByEmpId(Long empId);
}

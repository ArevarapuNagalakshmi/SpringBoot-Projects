package com.Employee.demo1.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

//@Data
@Entity
@Table

public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String EmpName;
    private Double EmpSal;
    private String EmpRole;
    private String EmpCompany;
    public Employees(Long EmpId, String EmpName, double EmpSal, String EmpRole, String EmpCompany){
       this.empId=EmpId;
       this.EmpName=EmpName;
       this.EmpSal=EmpSal;
       this.EmpRole=EmpRole;
       this.EmpCompany=EmpCompany;

    }
    public Employees(){
        super();
    }

    @Override
    public String toString() {
        return "Employees{" +
                "EmpId=" + empId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpSal=" + EmpSal +
                ", EmpRole='" + EmpRole + '\'' +
                ", EmpCompany='" + EmpCompany + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Double.compare(EmpSal, employees.EmpSal) == 0 && Objects.equals(empId, employees.empId) && Objects.equals(EmpName, employees.EmpName) && Objects.equals(EmpRole, employees.EmpRole) && Objects.equals(EmpCompany, employees.EmpCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, EmpName, EmpSal, EmpRole, EmpCompany);
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        empId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public double getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(double empSal) {
        EmpSal = empSal;
    }

    public String getEmpRole() {
        return EmpRole;
    }

    public void setEmpRole(String empRole) {
        EmpRole = empRole;
    }

    public String getEmpCompany() {
        return EmpCompany;
    }

    public void setEmpCompany(String empCompany) {
        EmpCompany = empCompany;
    }


}

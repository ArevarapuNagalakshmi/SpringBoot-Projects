package com.Employee.demo1.EmpDto;

import java.util.Objects;

public class EmpDto1 {
    private Long EmpId;
    private String EmpName;
    private double EmpSal;
    private String EmpRole;
    private String EmpCompany;
    public EmpDto1(Long EmpId, String EmpName, double EmpSal, String EmpRole, String EmpCompany){
        this.EmpId=EmpId;
        this.EmpName=EmpName;
        this.EmpSal=EmpSal;
        this.EmpRole=EmpRole;
        this.EmpCompany=EmpCompany;

    }
    //public void Employees(){
    //    super();
    //}

    @Override
    public String toString() {
        return "EmpDto1{" +
                "EmpId=" + EmpId +
                ", EmpName='" + EmpName + '\'' +
                ", EmpSal=" + EmpSal +
                ", EmpRole='" + EmpRole + '\'' +
                ", EmpCompany='" + EmpCompany + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmpDto1 empDto1 = (EmpDto1) o;
        return Double.compare(EmpSal, empDto1.EmpSal) == 0 && Objects.equals(EmpId, empDto1.EmpId) && Objects.equals(EmpName, empDto1.EmpName) && Objects.equals(EmpRole, empDto1.EmpRole) && Objects.equals(EmpCompany, empDto1.EmpCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpId, EmpName, EmpSal, EmpRole, EmpCompany);
    }

    public Long getEmpId() {
        return EmpId;
    }

    public void setEmpId(Long empId) {
        EmpId = empId;
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

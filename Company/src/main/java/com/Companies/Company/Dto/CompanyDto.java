package com.Companies.Company.Dto;

import com.Companies.Company.Entity.DemoCompany;

public class CompanyDto {
    private Integer cId;
    private  String cName;
    private  String cRole;

    public CompanyDto(Integer cId, String cName, String cRole) {
        this.cId = cId;
        this.cName = cName;
        this.cRole = cRole;
    }
    public CompanyDto(){
        super();
    }

    public CompanyDto(DemoCompany updateCompany) {
    }


    @Override
    public String toString() {
        return "CompanyDto{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cRole='" + cRole + '\'' +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcRole() {
        return cRole;
    }

    public void setcRole(String cRole) {
        this.cRole = cRole;
    }
}

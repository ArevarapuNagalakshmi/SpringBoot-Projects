package com.Companies.Company.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="companydtls")

public class DemoCompany {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer cId;
    private String cName;
    private  String cRole;

    public DemoCompany(Integer cId, String cName, String cRole) {
        this.cId = cId;
        this.cName = cName;
        this.cRole = cRole;
    }
    public DemoCompany(){
        super();
    }
    @Override
    public String toString() {
        return "DemoCompany{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cRole='" + cRole + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DemoCompany that = (DemoCompany) o;
        return Objects.equals(cId, that.cId) && Objects.equals(cName, that.cName) && Objects.equals(cRole, that.cRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId, cName, cRole);
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

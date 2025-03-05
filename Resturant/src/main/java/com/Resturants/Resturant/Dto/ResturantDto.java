package com.Resturants.Resturant.Dto;

import java.util.Objects;

public class ResturantDto {
    private Integer rId;
    private String rName;
    private String rLoc;
    private String rItems;
    private String rOrders;

    public ResturantDto(Integer rId, String rName, String rLoc, String rItems, String rOrders) {
        this.rId = rId;
        this.rName = rName;
        this.rLoc = rLoc;
        this.rItems = rItems;
        this.rOrders = rOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ResturantDto that = (ResturantDto) o;
        return Objects.equals(rId, that.rId) && Objects.equals(rName, that.rName) && Objects.equals(rLoc, that.rLoc) && Objects.equals(rItems, that.rItems) && Objects.equals(rOrders, that.rOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rId, rName, rLoc, rItems, rOrders);
    }

    @Override
    public String toString() {
        return "ResturantDto{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", rLoc='" + rLoc + '\'' +
                ", rItems='" + rItems + '\'' +
                ", rOrders='" + rOrders + '\'' +
                '}';
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrLoc() {
        return rLoc;
    }

    public void setrLoc(String rLoc) {
        this.rLoc = rLoc;
    }

    public String getrItems() {
        return rItems;
    }

    public void setrItems(String rItems) {
        this.rItems = rItems;
    }

    public String getrOrders() {
        return rOrders;
    }

    public void setrOrders(String rOrders) {
        this.rOrders = rOrders;
    }
}

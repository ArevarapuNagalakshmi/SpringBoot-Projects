package com.Vehicle.Vehicles.Dto;

import java.util.Objects;

public class VehicleDto {
    private Long id;
    private String name;
    private String model;
    private  String color;
    private String type;

    public VehicleDto(Long id, String name, String model, String color) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.type = type;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VehicleDto that = (VehicleDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(model, that.model) && Objects.equals(color, that.color) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, color, type);
    }

    @Override
    public String toString() {
        return "VehicleDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

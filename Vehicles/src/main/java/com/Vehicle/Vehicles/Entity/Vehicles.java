package com.Vehicle.Vehicles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String model;
    private String color;
    private String type;

    public Vehicles(Long id, String name, String model, String color, String type) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.type = type;
    }
    public Vehicles(){
        super();
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
        Vehicles vehicles = (Vehicles) o;
        return Objects.equals(id, vehicles.id) && Objects.equals(name, vehicles.name) && Objects.equals(model, vehicles.model) && Objects.equals(color, vehicles.color) && Objects.equals(type, vehicles.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, color, type);
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

package com.Laptop.Laptops.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Setter;

import java.util.Objects;

@Entity
@Data
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vid;
    private String name;
    private String model;
    private Integer storage;
    private Float pixels;

    public LaptopEntity(Long vid, String name, String model, Integer storage, Float pixels) {
        this.vid = vid;
        this.name = name;
        this.model = model;
        this.storage = storage;
        this.pixels = pixels;
    }
    public LaptopEntity(){
        super();
    }

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
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

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Float getPixels() {
        return pixels;
    }

    public void setPixels(Float pixels) {
        this.pixels = pixels;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LaptopEntity that = (LaptopEntity) o;
        return Objects.equals(vid, that.vid) && Objects.equals(name, that.name) && Objects.equals(model, that.model) && Objects.equals(storage, that.storage) && Objects.equals(pixels, that.pixels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vid, name, model, storage, pixels);
    }

    @Override
    public String toString() {
        return "LaptopEntity{" +
                "vid=" + vid +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                ", pixels=" + pixels +
                '}';
    }
}

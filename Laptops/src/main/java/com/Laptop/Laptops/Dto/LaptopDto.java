package com.Laptop.Laptops.Dto;

import java.util.Objects;

public class LaptopDto {
    private Long vid;
    private String name;
    private String model;
    private Integer storage;
    private Float pixels;

    public LaptopDto(Long vid, String name, String model, Integer storage, Float pixels) {
        this.vid = vid;
        this.name = name;
        this.model = model;
        this.storage = storage;
        this.pixels = pixels;
    }
public LaptopDto(){
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
        LaptopDto laptopDto = (LaptopDto) o;
        return Objects.equals(vid, laptopDto.vid) && Objects.equals(name, laptopDto.name) && Objects.equals(model, laptopDto.model) && Objects.equals(storage, laptopDto.storage) && Objects.equals(pixels, laptopDto.pixels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vid, name, model, storage, pixels);
    }

    @Override
    public String toString() {
        return "LaptopDto{" +
                "vid=" + vid +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", storage=" + storage +
                ", pixels=" + pixels +
                '}';
    }
}

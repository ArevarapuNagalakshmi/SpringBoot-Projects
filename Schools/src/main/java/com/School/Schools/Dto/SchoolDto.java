package com.School.Schools.Dto;

import java.util.Objects;

public class SchoolDto {
    private Long id;
    private String names;
    private String locations;
    private String sections;
    private String medium;

    public SchoolDto(Long id, String names, String locations, String sections, String medium) {
        this.id = id;
        this.names = names;
        this.locations = locations;
        this.sections = sections;
        this.medium = medium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SchoolDto schoolDto = (SchoolDto) o;
        return Objects.equals(id, schoolDto.id) && Objects.equals(names, schoolDto.names) && Objects.equals(locations, schoolDto.locations) && Objects.equals(sections, schoolDto.sections) && Objects.equals(medium, schoolDto.medium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, names, locations, sections, medium);
    }

    @Override
    public String toString() {
        return "SchoolDto{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", locations='" + locations + '\'' +
                ", sections='" + sections + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }
}

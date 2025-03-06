package com.School.Schools.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class SchoolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String names;
    private String locations;
    private String sections;
    private String medium;

    public SchoolEntity(Long id, String names, String locations, String sections, String medium) {
        this.id = id;
        this.names = names;
        this.locations = locations;
        this.sections = sections;
        this.medium = medium;
    }
    public SchoolEntity(){
        super();
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
        SchoolEntity that = (SchoolEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(names, that.names) && Objects.equals(locations, that.locations) && Objects.equals(sections, that.sections) && Objects.equals(medium, that.medium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, names, locations, sections, medium);
    }

    @Override
    public String toString() {
        return "SchoolEntity{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", locations='" + locations + '\'' +
                ", sections='" + sections + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }
}

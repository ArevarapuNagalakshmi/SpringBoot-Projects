package com.School.Schools.Serivices;

import com.School.Schools.Dto.SchoolDto;
import com.School.Schools.Entity.SchoolEntity;
import com.School.Schools.Repository.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SchoolService implements SchoolServices{

    @Autowired
    private SchoolRepo schoolRepo;

    @Override
    public SchoolDto saveSchool(SchoolDto schoolDto) {
        SchoolEntity schoolEntity=new SchoolEntity(
                schoolDto.getId(),
                schoolDto.getNames(),
                schoolDto.getLocations(),
                schoolDto.getSections(),
                schoolDto.getMedium()
        );
        SchoolEntity schoolEntity1=schoolRepo.save(schoolEntity);
        SchoolDto schoolDto1=new SchoolDto(
                schoolEntity1.getId(),
                schoolEntity1.getNames(),
                schoolEntity1.getLocations(),
                schoolEntity1.getSections(),
                schoolEntity1.getMedium()
        );
        return schoolDto1;
    }
    @Override
    public SchoolDto getSchool(Long id) {
            SchoolEntity schoolDto=schoolRepo.findById(id)
                    .orElseThrow(()->new RuntimeException("The resturent is not print:"+id));
            SchoolDto schoolDto1=new SchoolDto(
                    schoolDto.getId(),
                    schoolDto.getNames(),
                    schoolDto.getLocations(),
                    schoolDto.getSections(),
                    schoolDto.getMedium()
            );
            return schoolDto1;
        }

    @Override
    public SchoolDto updateSchool(Long id, SchoolDto schoolDto) {
        SchoolEntity school=schoolRepo.findById((id))
                .orElseThrow(()->new RuntimeException("The School is not present: "+id));
        school.setNames(schoolDto.getNames());
        school.setLocations(schoolDto.getLocations());
        school.setSections(schoolDto.getSections());
        school.setMedium(school.getMedium());
        SchoolEntity schoolEntity=schoolRepo.save(school);
        return new SchoolDto(
                schoolEntity.getId(),
                schoolEntity.getNames(),
                schoolEntity.getLocations(),
                schoolEntity.getSections(),
                schoolEntity.getMedium()
        );
    }

    @Override
    public SchoolEntity deleteSchool(Long id) {
        SchoolEntity schoolEntity=schoolRepo.findById(id)
                .orElseThrow(()->new RuntimeException("The students not present:"+id));
        schoolRepo.deleteById(id);
        return schoolEntity;
    }
}

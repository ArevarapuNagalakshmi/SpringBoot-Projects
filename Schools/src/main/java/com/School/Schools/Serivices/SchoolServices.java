package com.School.Schools.Serivices;


import com.School.Schools.Dto.SchoolDto;
import com.School.Schools.Entity.SchoolEntity;

public interface SchoolServices{
   SchoolDto saveSchool(SchoolDto schoolDto);
   SchoolDto getSchool(Long id);
   SchoolDto updateSchool(Long id,SchoolDto schoolDto);
   SchoolEntity deleteSchool(Long id);

}

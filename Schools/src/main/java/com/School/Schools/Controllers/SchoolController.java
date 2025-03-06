package com.School.Schools.Controllers;

import com.School.Schools.Dto.SchoolDto;
import com.School.Schools.Entity.SchoolEntity;
import com.School.Schools.Serivices.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schools")
public class SchoolController {
    @Autowired
    private SchoolServices schoolServices;

    @PostMapping("/saveschool")
    public ResponseEntity<SchoolDto> saveSchool(@RequestBody SchoolDto schoolDto){
        SchoolDto schoolDto1=schoolServices.saveSchool(schoolDto);
        return new ResponseEntity<>(schoolDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SchoolDto>getSchool(@PathVariable Long id){
         SchoolDto schoolDto=schoolServices.getSchool(id);
        return new ResponseEntity<>(schoolDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<SchoolDto>updateSchool(
            @PathVariable Long id,
            @RequestBody SchoolDto schoolDto){
   SchoolDto schoolDto1=schoolServices.updateSchool(id,schoolDto);
        return new ResponseEntity<>(schoolDto1,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<SchoolEntity>deleteSchool(@PathVariable Long id){
       SchoolEntity schoolEntity=schoolServices.deleteSchool(id);
        return new ResponseEntity<>(schoolEntity,HttpStatus.OK);
    }

}

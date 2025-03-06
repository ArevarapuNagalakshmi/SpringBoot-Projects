package com.School.Schools.Repository;

import com.School.Schools.Dto.SchoolDto;
import com.School.Schools.Entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchoolRepo extends JpaRepository<SchoolEntity,Long> {
    Optional<SchoolEntity>findById(Long id);

}

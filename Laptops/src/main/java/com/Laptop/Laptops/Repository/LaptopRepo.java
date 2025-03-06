package com.Laptop.Laptops.Repository;

import com.Laptop.Laptops.Entity.LaptopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LaptopRepo extends JpaRepository<LaptopEntity,Long> {
    Optional<LaptopEntity> findById(Long id);
}

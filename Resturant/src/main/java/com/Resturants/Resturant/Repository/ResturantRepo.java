package com.Resturants.Resturant.Repository;

import com.Resturants.Resturant.Dto.ResturantDto;
import com.Resturants.Resturant.Entity.ResturantDemo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResturantRepo extends JpaRepository<ResturantDemo,Integer> {
    Optional<ResturantDto> findByrId(Integer rId);

}

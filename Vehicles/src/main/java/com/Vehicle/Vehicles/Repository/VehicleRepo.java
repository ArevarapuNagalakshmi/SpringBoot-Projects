package com.Vehicle.Vehicles.Repository;

import com.Vehicle.Vehicles.Entity.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleRepo extends JpaRepository<Vehicles,Long> {
    @Override
    Optional<Vehicles> findById(Long id);
}

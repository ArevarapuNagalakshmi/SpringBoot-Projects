package com.Vehicle.Vehicles.Services;

import com.Vehicle.Vehicles.Dto.VehicleDto;
import com.Vehicle.Vehicles.Entity.Vehicles;

public interface VehicleService {
    VehicleDto saveVehicle(VehicleDto vehicleDto);
    VehicleDto getVehicle(Long id);
    VehicleDto updateVehicle(Long id,VehicleDto vehicleDto);
    Vehicles deleteVehicle(Long id);
}

package com.Vehicle.Vehicles.Services;

import com.Vehicle.Vehicles.Dto.VehicleDto;
import com.Vehicle.Vehicles.Entity.Vehicles;
import com.Vehicle.Vehicles.Repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServices implements VehicleService {
    @Autowired
    private VehicleRepo vehiclerepo;


    @Override
    public VehicleDto saveVehicle(VehicleDto vehicleDto) {
        Vehicles vehicles=new Vehicles(
                vehicleDto.getId(),
                vehicleDto.getName(),
                vehicleDto.getModel(),
                vehicleDto.getColor(),
                vehicleDto.getType()
        );
        Vehicles vehicles1=vehiclerepo.save(vehicles);

        VehicleDto vehicleDto1=new VehicleDto(
                vehicles1.getId(),
                vehicles1.getName(),
                vehicles1.getModel(),
                vehicles1.getColor()
        );
        return vehicleDto1;
    }
    @Override
    public VehicleDto getVehicle(Long id) {
        Vehicles vehicles= vehiclerepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
        VehicleDto vehicleDto=new VehicleDto(
                vehicles.getId(),
                vehicles.getName(),
                vehicles.getModel(),
                vehicles.getColor());
             return vehicleDto;
    }

    @Override
    public VehicleDto updateVehicle(Long id, VehicleDto vehicleDto) {
        Vehicles vehicles=vehiclerepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Products does not throws exception :"+id));
        vehicles.setName(vehicleDto.getName());
        vehicles.setColor(vehicleDto.getColor());
        vehicles.setModel(vehicleDto.getModel());
        vehicles.setType(vehicleDto.getType());
        Vehicles updateVehicles=vehiclerepo.save(vehicles);
        return new VehicleDto(
              updateVehicles.getId(),
                updateVehicles.getName(),
                updateVehicles.getModel(),
                updateVehicles.getColor()

        );
    }



    @Override
    public Vehicles deleteVehicle(Long id) {
       Vehicles vehicles=vehiclerepo.findById(id)
                .orElseThrow(()->new RuntimeException("The Vehicles is not present :"+id));
        vehiclerepo.deleteById(id);
        return vehicles;

    }
}

package com.Vehicle.Vehicles.Controller;

import com.Vehicle.Vehicles.Dto.VehicleDto;
import com.Vehicle.Vehicles.Entity.Vehicles;
import com.Vehicle.Vehicles.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vehicles")
public class VehicleController {
    @Autowired
    private VehicleService service;

    @PostMapping("/savevehicles")
    public ResponseEntity<VehicleDto> saveVehicle(@RequestBody VehicleDto vehicleDto){
        VehicleDto v1=service.saveVehicle(vehicleDto);
        return new ResponseEntity<>(v1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<VehicleDto>getVehicle(@PathVariable Long id){
        VehicleDto vehicleDto=service.getVehicle(id);
        return new ResponseEntity<>(vehicleDto,HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<VehicleDto>updateVehicle(@PathVariable Long id,
                        @RequestBody VehicleDto vehicleDto){
          VehicleDto v3=service.updateVehicle(id,vehicleDto);
        return new ResponseEntity<>(v3,HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Vehicles>deleteVehicle(@PathVariable Long id){
        Vehicles v4=service.deleteVehicle(id);
        return new ResponseEntity<>(v4,HttpStatus.OK);
    }



}

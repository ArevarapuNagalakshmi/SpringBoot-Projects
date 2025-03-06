package com.Resturants.Resturant.Controllers;

import com.Resturants.Resturant.Dto.ResturantDto;
import com.Resturants.Resturant.Entity.ResturantDemo;
import com.Resturants.Resturant.Services.DemoService;
import com.Resturants.Resturant.Services.ResturantService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Resturant")
public class DemoController {

        @Autowired
        private ResturantService service;

        @GetMapping("/{rId}")
        public ResponseEntity<ResturantDto>getResturant(@PathVariable Integer rId){
                ResturantDto resturantDto=service.getResturant(rId);
                return new ResponseEntity<>(resturantDto,HttpStatus.OK);
        }
        @PostMapping("/saveResturantDemo")
        public ResponseEntity<ResturantDto> saveResturant(@RequestBody ResturantDto resturantDto){
            ResturantDto A=service.saveResturantDemo(resturantDto);
            return new ResponseEntity<>(A,HttpStatus.CREATED);
        }

        @PutMapping("/{rId}")
        public ResponseEntity<ResturantDto>updateResturant(
                @PathVariable Integer rId,
                @RequestBody ResturantDto resturantDto){
                ResturantDto updateResturant=service.updateResturant(rId,resturantDto);
                return new ResponseEntity<>(updateResturant,HttpStatus.OK);
        }
        @DeleteMapping("/{rId}")
        public ResponseEntity<ResturantDemo>deleteResturant(@PathVariable Integer rId){
              ResturantDemo resturantDemo=service.deleteResturant((rId));
            return new ResponseEntity<>(resturantDemo,HttpStatus.OK);
        }


}

package com.project.concesionario.controller;

import com.project.concesionario.domain.pojo.CarBrandPojo;
import com.project.concesionario.domain.service.ICarBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador rest de marca coche
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marcas-coches")
public class CarBrandController {
    /**
     * Servicio de marca coche
     */
    private final ICarBrandService iCarBrandService;
    @GetMapping
    private ResponseEntity <List<CarBrandPojo>> getAll(){
        return  ResponseEntity.ok(iCarBrandService.getAll());
        //return ResponseEntity.status(HttpStatus.OK).body(iCarBrandService.getAll());
        //new ResponseEntity<>(iCarBrandService.getAll(),HttpStatus.OK);
    }
    @GetMapping(path = "/{id}")
    private ResponseEntity<CarBrandPojo> getCarBrand(@PathVariable Integer id){
        return ResponseEntity.of(iCarBrandService.getCarBrand(id));
    }
    @PostMapping
    private ResponseEntity<CarBrandPojo> save(CarBrandPojo newCarBrand){
        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCarBrandService.save(newCarBrand));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}

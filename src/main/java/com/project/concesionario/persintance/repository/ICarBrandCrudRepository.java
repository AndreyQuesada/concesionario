package com.project.concesionario.persintance.repository;

import com.project.concesionario.persintance.entity.CarBrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarBrandCrudRepository extends JpaRepository<CarBrandEntity, Integer> {

}

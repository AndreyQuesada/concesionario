package com.project.concesionario.domain.repository;

import com.project.concesionario.domain.pojo.CarBrandPojo;

import java.util.List;
import java.util.Optional;

public interface ICarBrandRepository {
    /**
     * Devuelve una lista con todos los marca coche
     * @return Lista con marcas de coches
     */
    List<CarBrandPojo> getAll();

    /**
     * Devuelve una marca de coche por medio de su id
     * @param id id de marca coche
     * @return Optinal del marca coche encontrado
     */
    Optional<CarBrandPojo> getCarBrand(Integer id);

    /**
     * Guarda una nueva marca coche
     * @param newCarBrand marca coche a guardar
     * @return Marca coche guardada
     */
    CarBrandPojo save(CarBrandPojo newCarBrand);

    /**
     * Elimina una marca de coche dada su id
     * @param idCarBrand id de la marca a borrar
     */
    void delete(Integer idCarBrand);
}

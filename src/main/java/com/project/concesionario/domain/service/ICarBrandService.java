package com.project.concesionario.domain.service;

import com.project.concesionario.domain.pojo.CarBrandPojo;

import java.util.List;
import java.util.Optional;

public interface ICarBrandService {
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
     * @return devuelve true si se elimino, y false si no se elimino
     */
    boolean delete(Integer idCarBrand);
}

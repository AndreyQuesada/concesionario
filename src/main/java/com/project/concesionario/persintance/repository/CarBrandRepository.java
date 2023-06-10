package com.project.concesionario.persintance.repository;

import com.project.concesionario.domain.pojo.CarBrandPojo;
import com.project.concesionario.domain.repository.ICarBrandRepository;
import com.project.concesionario.persintance.entity.CarBrandEntity;
import com.project.concesionario.persintance.mapper.ICarBrandMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
/**
 * Repositorio de marca coche
 */
public class CarBrandRepository implements ICarBrandRepository {
    /**
     * Crud de marca coche
     */
    private final ICarBrandCrudRepository iCarBrandCrudRepository;
    /**
     * Mapper de marca coche
     */
    private final ICarBrandMapper iCarBrandMapper;
    /**
     * Devuelve una lista con todos los marca coche
     * @return Lista con marcas de coches
     */
    @Override
    public List<CarBrandPojo> getAll() {
        return iCarBrandMapper.toMarcasCochePojo(iCarBrandCrudRepository.findAll());
    }

    /**
     * Devuelve una marca de coche por medio de su id
     * @param id id de marca coche
     * @return Optinal del marca coche encontrado
     */
    @Override
    public Optional<CarBrandPojo> getCarBrand(Integer id) {
        return iCarBrandCrudRepository.findById(id).map(iCarBrandMapper::toMarcaCochePojo);
        //carBrandEntity->iCarBrandMapper.toMarcaCochePojo(carBrandEntity); Lambda
        //iCarBrandMapper::toMarcaCochePojo por referencia
    }

    /**
     * Guarda una nueva marca coche
     * @param newCarBrand marca coche a guardar
     * @return Marca coche guardada
     */
    @Override
    public CarBrandPojo save(CarBrandPojo newCarBrand) {
        CarBrandEntity carBrandEntity = iCarBrandMapper.toMarcaCocheEntity(newCarBrand);
        return iCarBrandMapper.toMarcaCochePojo(iCarBrandCrudRepository.save(carBrandEntity));
    }

    /**
     * Elimina una marca de coche dada su id
     * @param idCarBrand id de la marca a borrar
     */
    @Override
    public void delete(Integer idCarBrand) {
        iCarBrandCrudRepository.deleteById(idCarBrand);
    }
}

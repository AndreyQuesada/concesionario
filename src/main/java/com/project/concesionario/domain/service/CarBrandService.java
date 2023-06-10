package com.project.concesionario.domain.service;

import com.project.concesionario.domain.pojo.CarBrandPojo;
import com.project.concesionario.domain.repository.ICarBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class CarBrandService implements ICarBrandService{
    /**
     * Repositorio de marca coche
     */
    private final ICarBrandRepository iCarBrandRepository;
    /**
     * Devuelve una lista con todos los marca coche
     * @return Lista con marcas de coches
     */
    @Override
    public List<CarBrandPojo> getAll() {
        return iCarBrandRepository.getAll();
    }
    /**
     * Devuelve una marca de coche por medio de su id
     * @param id id de marca coche
     * @return Optinal del marca coche encontrado
     */
    @Override
    public Optional<CarBrandPojo> getCarBrand(Integer id) {
        return iCarBrandRepository.getCarBrand(id);
    }
    /**
     * Guarda una nueva marca coche
     * @param newCarBrand marca coche a guardar
     * @return Marca coche guardada
     */
    @Override
    public CarBrandPojo save(CarBrandPojo newCarBrand) {
        return iCarBrandRepository.save(newCarBrand);
    }
    /**
     * Elimina una marca de coche dada su id
     * @param idCarBrand id de la marca a borrar
     * @return devuelve true si se elimino, y false si no se elimino
     */
    @Override
    public boolean delete(Integer idCarBrand) {
        try{
            iCarBrandRepository.delete(idCarBrand);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}

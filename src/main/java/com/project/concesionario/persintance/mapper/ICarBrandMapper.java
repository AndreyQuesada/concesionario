package com.project.concesionario.persintance.mapper;

import com.project.concesionario.domain.pojo.CarBrandPojo;
import com.project.concesionario.persintance.entity.CarBrandEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

/**
 * Mapper que transforma objetos de MarcaCoche a pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface ICarBrandMapper {
    /**
     * Convierte una entidad a un pojo de marcaCoche
     * @param marca Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    CarBrandPojo toMarcaCochePojo(CarBrandEntity marca);

    /**
     * Convierte un pojo a una entidad de marcaCoche
     * @param marcaPojo pojo a convertir
     * @return Entity convertida
     */
    @InheritInverseConfiguration
    CarBrandEntity toMarcaCocheEntity(CarBrandPojo marcaPojo);

    /**
     * Lista de marca coches transfromada a pojo de una lista de entidades
     * @param marcasCoche Entidad a transformar
     * @return Lista transformada
     */
    List<CarBrandPojo> toMarcasCochePojo(List<CarBrandEntity> marcasCoche);
}

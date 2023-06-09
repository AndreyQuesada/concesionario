package com.project.concesionario.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de marca coche
 */
@Getter
@Setter
public class CarBrandPojo {
    /**
     * Id de la marca
     */
    private Integer id;
    /**
     * Descripcion de la marca
     */
    private String description;
}

package org.example.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturado {
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
}
package org.example.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
}
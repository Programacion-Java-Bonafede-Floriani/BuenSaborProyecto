package org.example.Entities;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    private String nombre;
    private String razonSocial;
    private int cuil;
    private List<Sucursal> sucursales;
}


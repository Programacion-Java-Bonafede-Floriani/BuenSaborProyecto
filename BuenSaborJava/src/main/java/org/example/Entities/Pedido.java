package org.example.Entities;

import lombok.*;
import org.example.Entities.Enums.Estado;
import org.example.Entities.Enums.FormaPago;
import org.example.Entities.Enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    private double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
}
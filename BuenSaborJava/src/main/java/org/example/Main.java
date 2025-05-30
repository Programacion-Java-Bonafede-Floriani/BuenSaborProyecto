package org.example;

import org.example.Entities.*;
import org.example.Entities.Enums.Estado;
import org.example.Entities.Enums.FormaPago;
import org.example.Entities.Enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases básicas
        Pais pais = new Pais("Argentina");
        Provincia provincia = new Provincia("Buenos Aires");
        Localidad localidad = new Localidad("La Plata");
        Domicilio domicilio = new Domicilio("Calle Falsa", 123, 1900, localidad);

        // Crear una instancia de Usuario
        Usuario usuario = new Usuario("auth0|123456789", "usuario1");

        // Crear una instancia de Cliente
        Cliente cliente = new Cliente("Juan", "Perez", "123456789", "juan.perez@example.com", LocalDate.of(1985, 5, 15));

        // Crear una instancia de Empresa
        Empresa empresa = new Empresa("Buen Sabor", "Buen Sabor S.A.", 30123456789L, List.of());

        // Crear una instancia de Sucursal
        Sucursal sucursal = new Sucursal("Sucursal Central", LocalTime.of(8, 0), LocalTime.of(20, 0), domicilio, List.of(), List.of(usuario));

        // Agregar la sucursal a la empresa
        empresa.setSucursales(List.of(sucursal));

        // Crear una instancia de Promoción
        Promocion promocion = new Promocion("Promo Descuento", LocalDate.now(), LocalDate.now().plusDays(10), LocalTime.now(), LocalTime.now().plusHours(2), "20% de descuento", 10.0, TipoPromocion.happyHour);

        // Agregar la promoción a la sucursal
        sucursal.setPromociones(List.of(promocion));

        // Crear una instancia de ArticuloManufacturado
        ArticuloManufacturado articuloManufacturado = new ArticuloManufacturado("Descripción del artículo", 30, "Preparación especial");

        // Crear una instancia de Articulo
        Articulo articulo = new Articulo("Artículo 1", 15.0);

        // Crear una instancia de DetallePedido
        DetallePedido detallePedido = new DetallePedido(2, 30.0);

        // Crear una instancia de Pedido
        Pedido pedido = new Pedido(LocalTime.now().plusHours(1), 30.0, Estado.preparacion, TipoEnvio.delivery, FormaPago.MercadoPago, LocalDate.now());

        // Crear una instancia de Imagen
        Imagen imagen = new Imagen("Imagen del artículo");

        // Crear una instancia de UnidadMedida
        UnidadMedida unidadMedida = new UnidadMedida("Kilogramo");

        // Crear una instancia de Factura
        Factura factura = new Factura(LocalDate.now(), 12345, 67890, "pref123", "credit_card", FormaPago.MercadoPago, 30.0);

        // Imprimir algunas instancias para verificar los datos
        System.out.println("Empresa: " + empresa.getNombre());
        System.out.println("Sucursal: " + sucursal.getNombre());
        System.out.println("Promoción: " + promocion.getDenominacion());
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Usuario: " + usuario.getUsername());
        System.out.println("Pedido: " + pedido.getTotal());
    }
}

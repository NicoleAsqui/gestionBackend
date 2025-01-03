package com.gestionBackend.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PointOfSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // Nombre del punto de venta (e.g., "Tienda 1", "Gasolinera X")
    private String location;  // Ubicación del punto de venta

    // Relaciones con otros objetos si es necesario, por ejemplo, ventas
}


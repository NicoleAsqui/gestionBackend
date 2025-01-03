package com.gestionBackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;  // Nombre del proveedor (e.g., "Proveedor A")
    private String contactInfo;  // Información de contacto del proveedor

    // Relación con productos que el proveedor ofrece
}

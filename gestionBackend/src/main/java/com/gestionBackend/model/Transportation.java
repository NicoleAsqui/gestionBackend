package com.gestionBackend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transportation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;  // Descripción del costo de transporte (e.g., "Transporte mensual")
    private double cost;  // Costo de transporte
    private LocalDate date;  // Fecha del gasto de transporte
}

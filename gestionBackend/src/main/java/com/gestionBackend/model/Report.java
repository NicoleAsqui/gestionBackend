package com.gestionBackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalSales;   // Total de ventas
    private Double totalExpenses; // Total de gastos
    private Double netProfit;     // Ganancia neta

    @Temporal(TemporalType.DATE)
    private Date date;           // Fecha de reporte

}

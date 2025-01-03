package com.gestionBackend.repository;
import com.gestionBackend.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
    // Métodos personalizados si es necesario
}


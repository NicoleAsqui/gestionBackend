package com.gestionBackend.repository;

import com.gestionBackend.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
    // Puedes agregar métodos personalizados si es necesario
}

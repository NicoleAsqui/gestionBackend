package com.gestionBackend.repository;
import com.gestionBackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Puedes agregar métodos personalizados si es necesario
}

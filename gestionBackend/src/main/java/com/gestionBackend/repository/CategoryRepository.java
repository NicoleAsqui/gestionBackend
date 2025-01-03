package com.gestionBackend.repository;
import com.gestionBackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Métodos personalizados si es necesario
}

package com.gestionBackend.repository;

import com.gestionBackend.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    // Métodos personalizados si es necesario
}

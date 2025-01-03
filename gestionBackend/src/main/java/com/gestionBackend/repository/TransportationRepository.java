package com.gestionBackend.repository;

import com.gestionBackend.model.Transportation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportationRepository extends JpaRepository<Transportation, Long> {
}


package com.gestionBackend.service;
import com.gestionBackend.model.Transportation;
import com.gestionBackend.repository.TransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportationService {

    @Autowired
    private TransportationRepository transportationRepository;

    public List<Transportation> getAllTransportations() {
        return transportationRepository.findAll();
    }

    public Optional<Transportation> getTransportationById(Long id) {
        return transportationRepository.findById(id);
    }

    public Transportation createTransportation(Transportation transportation) {
        return transportationRepository.save(transportation);
    }

    public Transportation updateTransportation(Long id, Transportation transportation) {
        transportation.setId(id);
        return transportationRepository.save(transportation);
    }

    public void deleteTransportation(Long id) {
        transportationRepository.deleteById(id);
    }
}

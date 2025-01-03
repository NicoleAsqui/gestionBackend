package com.gestionBackend.service;
import com.gestionBackend.model.PointOfSale;
import com.gestionBackend.repository.PointOfSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PointOfSaleService {

    @Autowired
    private PointOfSaleRepository pointOfSaleRepository;

    public List<PointOfSale> getAllPointsOfSale() {
        return pointOfSaleRepository.findAll();
    }

    public Optional<PointOfSale> getPointOfSaleById(Long id) {
        return pointOfSaleRepository.findById(id);
    }

    public PointOfSale createPointOfSale(PointOfSale pointOfSale) {
        return pointOfSaleRepository.save(pointOfSale);
    }

    public PointOfSale updatePointOfSale(Long id, PointOfSale pointOfSale) {
        Optional<PointOfSale> existingPointOfSale = pointOfSaleRepository.findById(id);
        if (existingPointOfSale.isPresent()) {
            PointOfSale existing = existingPointOfSale.get();
            existing.setName(pointOfSale.getName());
            existing.setLocation(pointOfSale.getLocation());
            return pointOfSaleRepository.save(existing);
        }
        return null;
    }


    public void deletePointOfSale(Long id) {
        pointOfSaleRepository.deleteById(id);
    }
}

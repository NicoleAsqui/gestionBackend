package com.gestionBackend.controller;
import com.gestionBackend.model.PointOfSale;
import com.gestionBackend.service.PointOfSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/points-of-sale")
public class PointOfSaleController {

    @Autowired
    private PointOfSaleService pointOfSaleService;

    @GetMapping
    public List<PointOfSale> getAllPointsOfSale() {
        return pointOfSaleService.getAllPointsOfSale();
    }

    @GetMapping("/{id}")
    public Optional<PointOfSale> getPointOfSaleById(@PathVariable Long id) {
        return pointOfSaleService.getPointOfSaleById(id);
    }

    @PostMapping
    public PointOfSale createPointOfSale(@RequestBody PointOfSale pointOfSale) {
        return pointOfSaleService.createPointOfSale(pointOfSale);
    }

    @PutMapping("/{id}")
    public PointOfSale updatePointOfSale(@PathVariable Long id, @RequestBody PointOfSale pointOfSale) {
        return pointOfSaleService.updatePointOfSale(id, pointOfSale);
    }

    @DeleteMapping("/{id}")
    public void deletePointOfSale(@PathVariable Long id) {
        pointOfSaleService.deletePointOfSale(id);
    }
}

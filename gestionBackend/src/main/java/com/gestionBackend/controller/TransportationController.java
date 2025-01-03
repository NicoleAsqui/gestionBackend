package com.gestionBackend.controller;

import com.gestionBackend.model.Transportation;
import com.gestionBackend.service.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transportations")
public class TransportationController {

    @Autowired
    private TransportationService transportationService;

    @GetMapping
    public List<Transportation> getAllTransportations() {
        return transportationService.getAllTransportations();
    }

    @GetMapping("/{id}")
    public Optional<Transportation> getTransportationById(@PathVariable Long id) {
        return transportationService.getTransportationById(id);
    }

    @PostMapping
    public Transportation createTransportation(@RequestBody Transportation transportation) {
        return transportationService.createTransportation(transportation);
    }

    @PutMapping("/{id}")
    public Transportation updateTransportation(@PathVariable Long id, @RequestBody Transportation transportation) {
        return transportationService.updateTransportation(id, transportation);
    }

    @DeleteMapping("/{id}")
    public void deleteTransportation(@PathVariable Long id) {
        transportationService.deleteTransportation(id);
    }
}

package com.gestionBackend.controller;
import com.gestionBackend.model.Report;
import com.gestionBackend.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/generate")
    public ResponseEntity<Report> generateReport() {
        Report report = reportService.generateReport();
        return new ResponseEntity<>(report, HttpStatus.OK);
    }
}

package com.gestionBackend.service;
import com.gestionBackend.model.Expense;
import com.gestionBackend.model.Report;
import com.gestionBackend.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReportService {

    private final SaleService saleService;
    private final ExpenseService expenseService;

    @Autowired
    public ReportService(SaleService saleService, ExpenseService expenseService) {
        this.saleService = saleService;
        this.expenseService = expenseService;
    }

    public Report generateReport() {
        Double totalSales = calculateTotalSales();
        Double totalExpenses = calculateTotalExpenses();
        Double netProfit = totalSales - totalExpenses;

        Report report = new Report();
        report.setTotalSales(totalSales);
        report.setTotalExpenses(totalExpenses);
        report.setNetProfit(netProfit);
        report.setDate(new Date());

        return report;
    }

    private Double calculateTotalSales() {
        List<Sale> sales = saleService.getAllSales();
        return sales.stream().mapToDouble(Sale::getTotalPrice).sum();
    }

    private Double calculateTotalExpenses() {
        List<Expense> expenses = expenseService.getAllExpenses();
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }
}


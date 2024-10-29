package com.wsi.budgetservices.controller;

import com.netflix.discovery.converters.Auto;
import com.wsi.budgetservices.model.Budget;
import com.wsi.budgetservices.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BudgetController {

    @Autowired
    private BudgetService budgetService;

    @GetMapping("/budget/{userId}")
    public List<Budget> getBudgetsByUserId(@PathVariable("userId") Long userId) {
        System.out.println("BudgetController.getBudgetsByUserId");
        return budgetService.getBudgetsByUserId(userId);
    }
}

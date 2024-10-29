package com.wsi.budgetservices.service;

import com.wsi.budgetservices.BudgetServicesApplication;
import com.wsi.budgetservices.model.Budget;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class BudgetService {

    public List<Budget> getBudgetsByUserId(Long userId) {
        Budget budget = new Budget("1", "1", "1000");

        List list = new ArrayList<>();
        list.add(budget);
        return list;
    }
}

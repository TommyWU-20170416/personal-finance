package com.wsi.userservices.service;

import com.wsi.userservices.fiegn.BudgetClient;
import com.wsi.userservices.model.Budget;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final BudgetClient budgetClient;

    public UserService(BudgetClient budgetClient) {
        this.budgetClient = budgetClient;
    }

    public List<Budget> getBudgetsByUserId(Long userId) {
        return budgetClient.getBudgetsByUserId(userId);
    }
}

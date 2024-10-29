package com.wsi.budgetservices.repository;

import com.wsi.budgetservices.model.Budget;

import java.util.List;

public class BudgetRepository {
    List<Budget> findByUserId(Long userId) {
        return null;
    }
}
//public class BudgetRepository extends JpaRepository<Budget, Long>{
//    List<Budget> findByUserId(Long userId);
//}

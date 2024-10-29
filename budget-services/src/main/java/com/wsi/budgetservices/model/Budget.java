package com.wsi.budgetservices.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Budget {
    private String budgetId;
    private String userId;
    private String amount;
}

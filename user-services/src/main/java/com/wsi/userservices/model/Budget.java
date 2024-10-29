package com.wsi.userservices.model;

import lombok.Data;

@Data
public class Budget {
    private String budgetId;
    private String userId;
    private String amount;
}

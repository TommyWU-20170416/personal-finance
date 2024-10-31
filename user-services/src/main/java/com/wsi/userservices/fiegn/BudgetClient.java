package com.wsi.userservices.fiegn;

import com.wsi.userservices.config.LoadBalancerConfig;
import com.wsi.userservices.model.Budget;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "budget-services", configuration = LoadBalancerConfig.class)
public interface BudgetClient {
    @GetMapping("/budget/{userId}")
    List<Budget> getBudgetsByUserId(@PathVariable("userId") Long userId);
}

package com.wsi.budgetservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
@EnableEurekaClient
public class BudgetServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BudgetServicesApplication.class, args);
    }

}

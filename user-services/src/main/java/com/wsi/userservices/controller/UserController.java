package com.wsi.userservices.controller;

import com.wsi.userservices.model.Budget;
import com.wsi.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/budgetInfo/{userId}")
    public List<Budget> getBudgetInfo(@PathVariable Long userId) {
        return userService.getBudgetsByUserId(userId);
    }
}

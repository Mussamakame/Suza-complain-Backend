package com.example.SUZA.COMPLAIN.Controller;

import com.example.SUZA.COMPLAIN.Model.Category;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Service.CategoryService;
import com.example.SUZA.COMPLAIN.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/category")

public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("/Category")
    public List<Category> fetchAllCategory(){
        return  service.fetchCategory();
    }
    @GetMapping("/Category/{categoryId}")
    public Category fetchById(@PathVariable Long categoryId){
        return service.getCategoryById(categoryId);
    }
    @PostMapping("/Category")
    public  Category newCategory(@RequestBody Category category){
        return service.newCategory(category);
    }
    @DeleteMapping("/Category/{studentRegNo}")
    public String delete(Long categoryId){
        return service.deleteCategory(categoryId);
    }
}


package com.example.SUZA.COMPLAIN.Service;

import com.example.SUZA.COMPLAIN.Model.Category;
import com.example.SUZA.COMPLAIN.Model.Student;
import com.example.SUZA.COMPLAIN.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;
    public List<Category> fetchCategory(){
        return repository.findAll();
    }
    public Category newCategory(Category category){
        return repository.save(category);
    }
    public Category getCategoryById(Long categoryId){

        return repository.findById(categoryId).orElse(null);
    }
    public String deleteCategory(Long categoryId){
        repository.deleteById(categoryId);
        return "category deleted successful"+categoryId;
    }
    public ResponseEntity<Category> updateCategory(Long categoryId, Category categoryDetails){
        Category category = repository.findById(categoryId).orElse(null);
        category.setCategory_type(categoryDetails.getCategory_type());
        Category updateCategory = repository.save(category);
        return ResponseEntity.ok(updateCategory) ;
    }
}

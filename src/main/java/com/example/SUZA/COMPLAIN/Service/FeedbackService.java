//package com.example.SUZA.COMPLAIN.Service;
//
//import com.example.SUZA.COMPLAIN.Model.Category;
//import com.example.SUZA.COMPLAIN.Model.Dvc;
//import com.example.SUZA.COMPLAIN.Model.Feedback;
//import com.example.SUZA.COMPLAIN.Repository.CategoryRepository;
//import com.example.SUZA.COMPLAIN.Repository.DvcRepository;
//import com.example.SUZA.COMPLAIN.Repository.FeedbackRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//
//public class FeedbackService {
//    private FeedbackRepository repository;
//    public List<Feedback> fetchFeedback(){
//        return repository.findAll();
//    }
//    public Feedback newFeedback(Feedback feedback){
//        return repository.save(feedback);
//    }
//    public Category getCategoryById(Long categoryId){
//
//        return repository.findById(categoryId).orElse(null);
//    }
//    public String deleteCategory(Long categoryId){
//        repository.deleteById(categoryId);
//        return "category deleted successful"+categoryId;
//    }
//    public ResponseEntity<Category> updateCategory(Long categoryId, Category categoryDetails){
//        Category category = repository.findById(categoryId).orElse(null);
//        category.setCategory_type(categoryDetails.getCategory_type());
//        Category updateCategory = repository.save(category);
//        return ResponseEntity.ok(updateCategory) ;
//    }
//}
//
//
//
//
//
//

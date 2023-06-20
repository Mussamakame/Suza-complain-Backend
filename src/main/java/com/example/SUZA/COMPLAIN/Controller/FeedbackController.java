//package com.example.SUZA.COMPLAIN.Controller;
//
//import com.example.SUZA.COMPLAIN.Model.Dvc;
//import com.example.SUZA.COMPLAIN.Model.Feedback;
//import com.example.SUZA.COMPLAIN.Service.DvcService;
//import com.example.SUZA.COMPLAIN.Service.FeedbackService;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping(path = "/api/feedback" ,consumes = MediaType.APPLICATION_JSON_VALUE)
//
//
//public class FeedbackController {
//
//
//
//    private FeedbackService service;
//
//    @GetMapping("/get")
//    public List<Feedback> fetchAllFeedback(){
//        return  service.fetchFeedback();
//    }
//    @GetMapping("/get/{feedbackId}")
//    public FeedbackService fetchById(@PathVariable Long feedbackId){
//        return service.fetchFeedback(feedbackId);
//    }
//    @PostMapping("/add")
//    public  Feedback newFeedback(@RequestBody Feedback feedback){
//        return service.newFeedback(feedback);
//    }
//    public List<Feedback> getAllFeedBack(){
//        return service.fetchFeedback();
//    }
//    @DeleteMapping("/delete/{feedbackId}")
//    public String deleteById(@PathVariable Long feedbackId){
//        return service.deleteFeedback(feedbackId);
//    }
//
//}
//

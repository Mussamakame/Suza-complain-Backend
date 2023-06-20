package com.example.SUZA.COMPLAIN.Repository;

import com.example.SUZA.COMPLAIN.Model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
}

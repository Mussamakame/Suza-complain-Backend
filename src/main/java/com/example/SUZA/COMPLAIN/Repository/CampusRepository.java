package com.example.SUZA.COMPLAIN.Repository;

import com.example.SUZA.COMPLAIN.Model.Campus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampusRepository extends JpaRepository<Campus,Long> {
}

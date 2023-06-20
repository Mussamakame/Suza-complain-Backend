package com.example.SUZA.COMPLAIN.Repository;

import com.example.SUZA.COMPLAIN.Model.Dvc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DvcRepository extends JpaRepository<Dvc,Long> {
}

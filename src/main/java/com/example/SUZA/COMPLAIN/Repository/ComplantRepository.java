package com.example.SUZA.COMPLAIN.Repository;

import com.example.SUZA.COMPLAIN.Model.Complant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplantRepository extends JpaRepository<Complant,Long> {
}

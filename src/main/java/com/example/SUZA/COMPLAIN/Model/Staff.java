package com.example.SUZA.COMPLAIN.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String staffName;
    private String email;
    private String phone;
    private String department;
    private String campus;


}

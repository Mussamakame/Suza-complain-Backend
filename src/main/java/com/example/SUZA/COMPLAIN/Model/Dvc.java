package com.example.SUZA.COMPLAIN.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="dvc")
public class Dvc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String phone;
    private String email;
    private String category;
}

package com.example.SUZA.COMPLAIN.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String camp;

    @ManyToOne
    private Campus campus;
}

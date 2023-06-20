package com.example.SUZA.COMPLAIN.Model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private String uname;
    private String email;
    private String phone;
    private String department;
    private String campus;

}

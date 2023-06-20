package com.example.SUZA.COMPLAIN.Repository;


import com.example.SUZA.COMPLAIN.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsersRepository extends JpaRepository<User,String> {

}

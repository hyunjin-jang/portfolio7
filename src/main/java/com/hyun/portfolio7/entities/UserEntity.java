package com.hyun.portfolio7.entities;

import com.hyun.portfolio7.entities.reference.Gender;
import com.hyun.portfolio7.entities.reference.UserName;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UserName userName;
    private String userEmail;
    private String userAddress;
    private int birthday;
    private Gender gender;

}

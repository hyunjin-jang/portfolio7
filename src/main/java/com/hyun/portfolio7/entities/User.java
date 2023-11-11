package com.hyun.portfolio7.entities;

import com.hyun.portfolio7.entities.reference.Gender;
import com.hyun.portfolio7.entities.reference.UserAddress;
import com.hyun.portfolio7.entities.reference.UserName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private UserName userName;
    private String userNickName;
    private String userImage;
    private String userEmail;
    private UserAddress userAddress;
    private String userBirthday;
    private Gender userGender;
    @OneToMany(mappedBy = "user")
    private List<Posting> postings = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Comment> comments = new ArrayList<>();
}

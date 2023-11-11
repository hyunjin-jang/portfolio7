package com.hyun.portfolio7.entities.dto;

import com.hyun.portfolio7.entities.reference.Gender;
import com.hyun.portfolio7.entities.reference.UserAddress;
import com.hyun.portfolio7.entities.reference.UserName;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequestDto {
    @Embedded
    private UserName userName;
    private String userNickName;
    private String userImage;
    private String userEmail;
    @Embedded
    private UserAddress userAddress;
    private String userPassword;
    private String userPhoneNumber;
    private String userBirthday;
    private Gender userGender;
}

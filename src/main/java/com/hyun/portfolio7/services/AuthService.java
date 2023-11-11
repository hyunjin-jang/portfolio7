package com.hyun.portfolio7.services;

import com.hyun.portfolio7.entities.User;
import com.hyun.portfolio7.entities.dto.SignUpRequestDto;
import com.hyun.portfolio7.entities.reference.Gender;
import com.hyun.portfolio7.entities.reference.UserAddress;
import com.hyun.portfolio7.entities.reference.UserName;
import com.hyun.portfolio7.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;

    public void signUp(SignUpRequestDto dto) {
        User user = User.builder()
                .userName(dto.getUserName())
                .userNickName(dto.getUserNickName())
                .userImage(dto.getUserImage())
                .userEmail(dto.getUserEmail())
                .userAddress(dto.getUserAddress())
                .userGender(dto.getUserGender())
                .userBirthday(dto.getUserBirthday())
                .build();
        userRepository.save(user);
    }
}
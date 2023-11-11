package com.hyun.portfolio7.controllers;

import com.hyun.portfolio7.entities.dto.SignUpRequestDto;
import com.hyun.portfolio7.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public void signUp(@RequestBody SignUpRequestDto dto) {
        authService.signUp(dto);
    }
}

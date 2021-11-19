package com.furkanergun.authserver.controllers;

import com.furkanergun.authserver.entities.AuthRequest;
import com.furkanergun.authserver.entities.AuthResponse;
import com.furkanergun.authserver.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(final AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(value = "/register")
    public ResponseEntity<AuthResponse> register(@RequestBody AuthRequest authRequest) {
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        System.out.println("DENEMELERRRRRRRRRRRRRRR");
        return ResponseEntity.ok(authService.register(authRequest));
    }

}

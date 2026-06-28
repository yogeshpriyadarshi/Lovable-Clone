package lovable.example.lovable.Clone.controllers;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.auth.LoginRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpRequest;
import lovable.example.lovable.Clone.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private AuthService authService;


    @PostMapping("signup")
    public ResponseEntity<SignUpRequest> signup( SignUpRequest signUpRequest ){
        return ResponseEntity.ok(authService.signup(signUpRequest ));
    }

    public ResponseEntity<LoginRequest> login(LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }






}

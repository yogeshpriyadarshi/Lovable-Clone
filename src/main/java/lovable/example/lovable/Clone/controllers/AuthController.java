package lovable.example.lovable.Clone.controllers;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.auth.LoginRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpRequest;
import lovable.example.lovable.Clone.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private AuthService authService;

    @PostMapping("/test")
    public String test(){
        return "working spring boot";
    }

    @PostMapping("/signup")
    public ResponseEntity<SignUpRequest> signup( @RequestBody SignUpRequest signUpRequest ){
        return ResponseEntity.ok(authService.signup(signUpRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<LoginRequest> login(@RequestBody LoginRequest loginRequest){
        return ResponseEntity.ok(authService.login(loginRequest));
    }






}

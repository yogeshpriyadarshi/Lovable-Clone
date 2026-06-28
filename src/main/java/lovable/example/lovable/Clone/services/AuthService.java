package lovable.example.lovable.Clone.services;

import lovable.example.lovable.Clone.dto.auth.LoginRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpRequest;

public interface AuthService {

    SignUpRequest signup(SignUpRequest signUpRequest);

    LoginRequest login(LoginRequest loginRequest);

}

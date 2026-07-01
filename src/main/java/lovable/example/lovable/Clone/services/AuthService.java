package lovable.example.lovable.Clone.services;

import lovable.example.lovable.Clone.dto.auth.LoginRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpResponse;

public interface AuthService {

    SignUpResponse signup(SignUpRequest signUpRequest);

    LoginRequest login(LoginRequest loginRequest);

}

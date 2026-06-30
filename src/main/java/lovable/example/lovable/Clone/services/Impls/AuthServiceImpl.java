package lovable.example.lovable.Clone.services.Impls;

import lovable.example.lovable.Clone.dto.auth.LoginRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpRequest;
import lovable.example.lovable.Clone.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public SignUpRequest signup(SignUpRequest signUpRequest) {

        return signUpRequest;
    }

    @Override
    public LoginRequest login(LoginRequest loginRequest) {
        return null;
    }
}

package lovable.example.lovable.Clone.services.Impls;

import lombok.RequiredArgsConstructor;
import lovable.example.lovable.Clone.dto.auth.LoginRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpRequest;
import lovable.example.lovable.Clone.dto.auth.SignUpResponse;
import lovable.example.lovable.Clone.entities.User;
import lovable.example.lovable.Clone.repositries.AuthRepositry;
import lovable.example.lovable.Clone.security.JwtService;
import lovable.example.lovable.Clone.services.AuthService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthRepositry authRepositry;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;


    @Override
    public SignUpResponse signup(SignUpRequest signUpRequest) {

        // check email exist or not
      if( authRepositry.existsByEmail(signUpRequest.email())){
          throw  new RuntimeException("User already exists");
      }

      User newuser = new User();
      newuser.setFirstName(signUpRequest.firstName());
      newuser.setLastName(signUpRequest.lastName());
      newuser.setEmail(signUpRequest.email());
      newuser.setPassword(passwordEncoder.encode(signUpRequest.password()));
       User savedUser = authRepositry.save(newuser);

        return new SignUpResponse(
                savedUser.getId(),
                savedUser.getFirstName(),
                savedUser.getLastName(),
                savedUser.getEmail()
        );
    }

    @Override
    public String login(LoginRequest loginRequest) {
        // check email exist or not
        if( !authRepositry.existsByEmail(loginRequest.email())){
            throw  new RuntimeException("User does not exists");
        }

        User user = authRepositry.findByEmail(loginRequest.email())
                .orElseThrow();

        if(!passwordEncoder.matches(
                loginRequest.password(),
                user.getPassword())){

            throw new RuntimeException("Invalid Credentials");
        }

        return jwtService.generateToken(user.getEmail());

    }
}

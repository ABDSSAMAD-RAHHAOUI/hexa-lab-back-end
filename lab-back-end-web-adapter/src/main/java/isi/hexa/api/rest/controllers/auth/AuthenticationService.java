package isi.hexa.api.rest.controllers.auth;

import com.isi.hexa.api.security.JwtService;
import com.isi.hexa.core.models.User;
import com.isi.hexa.core.port.in.user.FindUserByEmailUseCase;
import com.isi.hexa.core.port.in.user.RegisterUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {



    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private  final RegisterUserUseCase registerUserUseCase;
    private  final FindUserByEmailUseCase findUserByEmailUseCase;

    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        try {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = findUserByEmailUseCase.findByEmail(request.getEmail());

        var jwtToken = jwtService.generateToken(user);
        System.out.println(user.getId() + "********" + jwtToken);

        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .build();
    }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .username(request.getUsername())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(request.getRoles())
                .build();

        registerUserUseCase.save(user);
        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .build();
    }

}

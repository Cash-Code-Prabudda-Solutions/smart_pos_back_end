package EcommerceEAD.Cash_Code.service;

import com.ead.computers.dao.request.SignInRequest;
import com.ead.computers.dao.request.SignUpRequest;
import com.ead.computers.dao.response.JwtAuthenticationResponse;

public interface authService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);
}

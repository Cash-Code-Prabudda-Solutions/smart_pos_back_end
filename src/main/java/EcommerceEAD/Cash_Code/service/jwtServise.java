package EcommerceEAD.Cash_Code.service;

import org.springframework.security.core.userdetails.UserDetails;
public interface jwtServise {
    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);
}

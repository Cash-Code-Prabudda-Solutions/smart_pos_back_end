package EcommerceEAD.Cash_Code.repo;

import EcommerceEAD.Cash_Code.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface userRepo extends JpaRepository<user,Integer> {
    Optional<user> findByEmail(String email);
}

package flower.store.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
    @Query
    public Optional<AppUser> findAppUserByEmail(String email);
}

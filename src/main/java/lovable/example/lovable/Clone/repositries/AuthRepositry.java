package lovable.example.lovable.Clone.repositries;

import lovable.example.lovable.Clone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepositry extends JpaRepository<User,Long> {
    boolean existsByEmail(String email);
}

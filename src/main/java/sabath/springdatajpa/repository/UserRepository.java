package sabath.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sabath.springdatajpa.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}

package monkey.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import monkey.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

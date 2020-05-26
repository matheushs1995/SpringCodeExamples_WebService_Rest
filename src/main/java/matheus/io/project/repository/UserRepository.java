package matheus.io.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import matheus.io.project.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

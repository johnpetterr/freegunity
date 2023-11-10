package org.freegunity.redeSocial.repository;

import java.util.Optional;

import org.freegunity.redeSocial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public Optional<User> findByUsernameIgnoreCase(String username);

	public Optional<User> findAllByNomeContainingIgnoreCase(String nome);
}

package org.freegunity.redeSocial.repository;

import java.util.List;

import org.freegunity.redeSocial.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByTituloContainingIgnoreCase(String titulo);
}

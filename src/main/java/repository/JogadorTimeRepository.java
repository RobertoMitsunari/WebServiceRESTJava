package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.JogadorTime;

public interface JogadorTimeRepository extends JpaRepository<JogadorTime, Integer>{

	JogadorTime udfJogadorIdade(int codigo);
}

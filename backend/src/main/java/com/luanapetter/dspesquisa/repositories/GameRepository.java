package com.luanapetter.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}

package com.luanapetter.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}

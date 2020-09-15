package com.luanapetter.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luanapetter.dspesquisa.dto.GameDTO;
import com.luanapetter.dspesquisa.entities.Game;
import com.luanapetter.dspesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll(){
		List<Game> list = repository.findAll();
		//converte a lista game para gameDTO
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
}

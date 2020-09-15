package com.luanapetter.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanapetter.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}

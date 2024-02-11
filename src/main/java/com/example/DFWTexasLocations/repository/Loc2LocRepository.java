package com.example.DFWTexasLocations.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DFWTexasLocations.model.Loc2Loc;

@Repository
public interface Loc2LocRepository extends CrudRepository<Loc2Loc, Long>{
	Optional<Loc2Loc> findByLocationsKey(String loc2locKey);
}

package com.example.DFWTexasLocations.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DFWTexasLocations.model.Locations;

@Repository
public interface LocationsRepository extends CrudRepository<Locations, Long>{

	Optional<Locations> findByLocation(String locName);
	List<Locations> findAll();

}

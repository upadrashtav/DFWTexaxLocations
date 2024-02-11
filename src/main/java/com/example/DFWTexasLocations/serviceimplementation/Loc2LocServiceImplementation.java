package com.example.DFWTexasLocations.serviceimplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DFWTexasLocations.model.Loc2Loc;
import com.example.DFWTexasLocations.repository.Loc2LocRepository;
import com.example.DFWTexasLocations.service.Loc2LocService;

@Service
public class Loc2LocServiceImplementation implements Loc2LocService {
	
	@Autowired
	private Loc2LocRepository loc2locRepository;
	
	public Loc2LocServiceImplementation(Loc2LocRepository loc2locRepository) {
		super();
		this.loc2locRepository = loc2locRepository;
	}

	@Override
	public Optional<Loc2Loc> getLoc2LocByLocationsKey(String loc2locKey) {
		return loc2locRepository.findByLocationsKey(loc2locKey);
	}
	
}

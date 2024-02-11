package com.example.DFWTexasLocations.service;

import java.util.Optional;

import com.example.DFWTexasLocations.model.Loc2Loc;

public interface Loc2LocService {
	Optional<Loc2Loc>getLoc2LocByLocationsKey(String loc2locKey);
}

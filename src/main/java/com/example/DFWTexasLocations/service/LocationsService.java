package com.example.DFWTexasLocations.service;

import java.util.Optional;

import com.example.DFWTexasLocations.model.Locations;

public interface LocationsService {
	Optional<Locations> getLocationByName(String locName);
	Iterable<Locations> getAllLocations();

}

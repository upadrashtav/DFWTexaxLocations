package com.example.DFWTexasLocations.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.DFWTexasLocations.model.Locations;
import com.example.DFWTexasLocations.service.LocationsService;


@RestController
@RequestMapping("/locations")
public class LocationsController {
	
	@Autowired
	private LocationsService locationsService;
	
	public LocationsController(LocationsService locationsService) {
		super();
		this.locationsService = locationsService;
	}
	
	@GetMapping(path="/findByName/{locName}")
//	public Optional<Locations> getLocationByName(@RequestParam String locName) {
	public Optional<Locations> getLocationByName(@PathVariable String locName) {
		  Optional<Locations> optionalLocation = locationsService.getLocationByName(locName);
		  return optionalLocation;
	}
	
	@GetMapping(path="/findAllLocations")
	public Iterable<Locations> getAllLocations() {
		  return locationsService.getAllLocations();
	}
		
}

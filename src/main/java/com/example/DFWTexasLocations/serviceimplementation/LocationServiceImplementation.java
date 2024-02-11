package com.example.DFWTexasLocations.serviceimplementation;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.DFWTexasLocations.model.Locations;
import com.example.DFWTexasLocations.repository.LocationsRepository;
import com.example.DFWTexasLocations.service.LocationsService;


@Service
public class LocationServiceImplementation implements LocationsService{

		@Autowired
		private LocationsRepository locationsRepository;
		
		public LocationServiceImplementation(LocationsRepository locationsRepository) {
			super();
			this.locationsRepository = locationsRepository;
		}

		@Override
		public Optional<Locations> getLocationByName(String locName) {
			// TODO Auto-generated method stub
			return locationsRepository.findByLocation(locName);	
		}

		@Override
		public Iterable<Locations> getAllLocations() {
			// TODO Auto-generated method stub
			return locationsRepository.findAll();
		}
}

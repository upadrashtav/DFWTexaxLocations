package com.example.DFWTexasLocations.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DFWTexasLocations.model.Loc2Loc;
import com.example.DFWTexasLocations.service.Loc2LocService;

import jakarta.servlet.http.HttpServletRequest;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/loc2loc")
public class Loc2LocController {

	@Autowired
	private Loc2LocService loc2locService;

	public Loc2LocController(Loc2LocService loc2locService) {
		super();
		this.loc2locService = loc2locService;
	}
	
//	@GetMapping(path="/findByLoc2Loc/{loc2locKey}")
//	public Optional<Loc2Loc> getLoc2LocByLocationsKey(@PathVariable String loc2locKey) {
//		  Optional<Loc2Loc> optionalLoc2Loc = loc2locService.getLoc2LocByLocationsKey(loc2locKey);
////		  optionalLoc2Loc.get();
//		  return optionalLoc2Loc;
//	}
	
	@GetMapping(path="/findByLoc2Loc/{loc2locKey}")
	public ResponseEntity<Loc2Loc> getLoc2LocByLoc2LocKey(@PathVariable String loc2locKey) {
//		String requestUrl = request.getRequestURL().toString();
//        System.out.println("Request URL: " + requestUrl);
	    Optional<Loc2Loc> optionalLoc2Loc = loc2locService.getLoc2LocByLocationsKey(loc2locKey);
	    if (optionalLoc2Loc.isPresent()) {
	        Loc2Loc loc2loc = optionalLoc2Loc.get();
	        return ResponseEntity.ok(loc2loc);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
}

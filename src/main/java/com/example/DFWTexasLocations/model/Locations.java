package com.example.DFWTexasLocations.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name="locations")
@JsonIgnoreProperties(ignoreUnknown = true)
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Locations {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty()
	private long id;
	
	@Column(name="location",nullable=false)
	@JsonProperty("location")
	private String location;
	
	@Column(name="activestatus",nullable=false)
	@JsonProperty("activestatus")
	private String activeStatus;
}

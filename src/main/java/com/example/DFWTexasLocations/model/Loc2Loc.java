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
@Table(name="loc2loc")
@JsonIgnoreProperties(ignoreUnknown = true)
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Loc2Loc {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@JsonProperty()
		private long id;
		
		@Column(name="locationskey",nullable=false)
		@JsonProperty("locationsKey")
		private String locationsKey;
		
		@Column(name="fromLocation",nullable=false)
		@JsonProperty("fromLocation")
		private String fromLocation;
		
		@Column(name="toLocation", nullable=false)
		@JsonProperty("toLocation")
		private String toLocation;
		
		@Column(name="distance", nullable=false)
		@JsonProperty("distance")
		private Integer distance;
		
		@Column(name="fare", nullable=false)
		@JsonProperty("fare")
		private double fare;
	}


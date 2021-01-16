package com.example.demo.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationservice;
	
	@RequestMapping(value = "/locations")
	public List<Location> getAllLocations(){
		return locationservice.getAllLocations(); 
		
	}
	
	@RequestMapping(value = "/locations/{id}")
	public Location getLocation(@PathVariable String id) {
		return locationservice.getLocation(id);
	}

}

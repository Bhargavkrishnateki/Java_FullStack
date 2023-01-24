package com.example.placementClass.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.placementClass.entity.Placement;
import com.example.placementClass.service.PlacementService;


@RestController
@CrossOrigin(allowedHeaders = "*", origins = "*" )
public class PlacementController {
	@Autowired	
	private PlacementService placementService;
	
	@PostMapping("/registerPlacement") 
	public Placement registerPlacement(@RequestBody Placement placement) {
		return placementService.registerPlacement(placement) ;
	}
	
	@GetMapping("/searchPlacement/{id}")
	public Placement searchPlacement(@PathVariable Long id ) {
		return placementService.searchPlacementById(id);
	}
	
	@DeleteMapping("/deletePlacement/{id}")
	public void  deletePlacement(@PathVariable Long id ) {
		placementService.deletePlacement(id);
	}
	
	@PutMapping("/updatePlacement") 
	public Placement updatePlacement(@RequestBody Placement placement ) {
		return placementService.updatePlacement(placement);
		}
	
}

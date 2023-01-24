package com.example.placementClass.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.placementClass.entity.Placement;
import com.example.placementClass.repository.PlacementRepository;

@Service
public class PlacementService {
	@Autowired
	private PlacementRepository placementRepository ;
	
	public Placement registerPlacement(Placement placement) {
		return placementRepository.save(placement);	
	}
	
	public Placement searchPlacementById(long id) {
		return placementRepository.findById(id).get();
	}
	
	public void deletePlacement(long id) {
		 placementRepository.deleteById(id);
	}
	
	public Placement updatePlacement(Placement placement) {
		Long id = placement.getId();
		Placement plc = placementRepository.findById(id).get();
		plc.setName(placement.getName());
		plc.setCollegeName(placement.getCollegeName());
		// plc.setDate(placement.getDate());
		plc.setQualification(placement.getQualification());
		plc.setYear(placement.getYear());
		return placementRepository.save(plc);
	}
}

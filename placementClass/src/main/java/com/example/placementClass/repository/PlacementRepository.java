package com.example.placementClass.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.placementClass.entity.Placement;
public interface PlacementRepository extends CrudRepository<Placement, Long> {
	}

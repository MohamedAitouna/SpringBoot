package com.example.startstart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.startstart.model.FeatureToggle;
import com.example.startstart.repository.FeatureToggleRepository;

@Service

public class FeatureToggleService {

	@Autowired
	FeatureToggleRepository featureToggleRepository;

	public List<FeatureToggle> findAll() {
		List<FeatureToggle> featuresToggle = featureToggleRepository.findAll();
		return featuresToggle;
	}
	
	public FeatureToggle save(FeatureToggle featureToggle){
		return featureToggleRepository.save(featureToggle);
	}
}


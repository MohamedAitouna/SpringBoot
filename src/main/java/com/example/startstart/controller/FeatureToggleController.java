package com.example.startstart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.startstart.model.FeatureToggle;
import com.example.startstart.service.FeatureToggleService;


@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:8090")
public class FeatureToggleController {

	@Autowired
	FeatureToggleService featureToggleService;

	@GetMapping("/featuresToggle")
	public List<FeatureToggle> getAllFeaturesToggle() {
		List<FeatureToggle> featuresToggle = featureToggleService.findAll();
		return featuresToggle;
	}

	@PostMapping(value = "/createFeatureToggle", consumes = "application/json", produces = "application/json")
	public FeatureToggle create(@RequestBody  FeatureToggle featureToggle) {
		return featureToggleService.save(featureToggle);
	}
}

package com.example.togglz.TogglzExample.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.togglz.TogglzExample.service.FeaturesExampleService;

@RestController
@RequestMapping("/v1")
public class FeaturesExampleController {
	
	@Inject
	FeaturesExampleService featuresService;
	

	@GetMapping("/featureone")
	public ResponseEntity<String> doFeatureOne() {
		String response = featuresService.doFeatureOneService();
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@GetMapping("/featuretwo")
	public ResponseEntity<String> doFeaturetwo() {
		String response = featuresService.doFeatureTwoService();
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	
	
}

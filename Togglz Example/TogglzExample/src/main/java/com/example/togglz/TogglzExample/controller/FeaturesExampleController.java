package com.example.togglz.TogglzExample.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;

import com.example.togglz.TogglzExample.enums.MyFeatures;
import com.example.togglz.TogglzExample.service.FeaturesExampleService;

@RestController
@RequestMapping("/v1")
public class FeaturesExampleController {
	
	@Inject
	FeaturesExampleService featuresService;
	
	
	@GetMapping("/featureone")
	public String doFeatureOne() {
		return featuresService.doFeatureOneService();
	}
	
	@GetMapping("/featuretwo")
	public String doFeaturetwo() {
		return featuresService.doFeatureTwoService();
	}
	
	
	
}

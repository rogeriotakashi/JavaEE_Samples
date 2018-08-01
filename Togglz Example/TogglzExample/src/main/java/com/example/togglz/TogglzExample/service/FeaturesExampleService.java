package com.example.togglz.TogglzExample.service;

import org.springframework.stereotype.Service;

import com.example.togglz.TogglzExample.enums.MyFeatures;

@Service
public class FeaturesExampleService {

	public String doFeatureOneService() {
		
		if(MyFeatures.FEATURE_ONE.isActive())		
			return "Hello, Feature one is active!";
		
		return "Feature one is not active";
	}
	
	public String doFeatureTwoService() {
		
		if(MyFeatures.FEATURE_TWO.isActive())		
			return "Hi, Feature two is active!";
		
		return "Feature two is not active";
	}
}

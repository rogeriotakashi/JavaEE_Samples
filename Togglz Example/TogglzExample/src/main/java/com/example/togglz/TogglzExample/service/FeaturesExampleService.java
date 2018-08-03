package com.example.togglz.TogglzExample.service;

import org.springframework.stereotype.Service;


import com.example.togglz.TogglzExample.enums.MyFeatures;

@Service
public class FeaturesExampleService {
	
	public String doFeatureOneService() {
		
		StringBuilder sb = new StringBuilder("Rogerio");
		
		if(MyFeatures.FEATURE_ONE.isActive()) {		
			sb.append(" Takashi Hirata");
		}
		
		return sb.toString();
	}
	
	public String doFeatureTwoService() {
		
		StringBuilder sb = new StringBuilder("Rogerio");
		
		if(MyFeatures.FEATURE_TWO.isActive()) {		
			sb.append(" Takashi Hirata");
		}
		
		return sb.toString();
	}
}

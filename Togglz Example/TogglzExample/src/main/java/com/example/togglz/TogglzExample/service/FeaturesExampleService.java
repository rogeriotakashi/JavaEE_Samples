package com.example.togglz.TogglzExample.service;

import java.io.File;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.togglz.core.manager.FeatureManager;

import com.example.togglz.TogglzExample.enums.MyFeatures;

@Service
public class FeaturesExampleService {
	
	@Inject
	FeatureManager manager;

	public String doFeatureOneService() {
		System.out.println("inicio1");
		if(manager.isActive(MyFeatures.FEATURE_ONE)) {		
			System.out.println("teste1");
			return "Hello, Feature one is active!";
		}
		
		return "Feature one is not active";
	}
	
	public String doFeatureTwoService() {
		System.out.println("inicio2");
		if(MyFeatures.FEATURE_TWO.isActive()) {		
			System.out.println("teste2");
			return "Hi, Feature two is active!";
		}
		
		return "Feature two is not active";
	}
}

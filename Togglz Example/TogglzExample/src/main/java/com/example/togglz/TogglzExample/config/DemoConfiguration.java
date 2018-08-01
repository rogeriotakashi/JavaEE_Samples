package com.example.togglz.TogglzExample.config;

import java.io.File;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

import com.example.togglz.TogglzExample.enums.MyFeatures;

@Component
public class DemoConfiguration implements TogglzConfig{

	@Override
	public Class<? extends Feature> getFeatureClass() {
		return MyFeatures.class;
	}

	@Override
	public StateRepository getStateRepository() {	
		return new FileBasedStateRepository(new File("/tmp/features.properties"));
	}

	@Override
	public UserProvider getUserProvider() {
		return new ServletUserProvider(null);
	}
	
	

}

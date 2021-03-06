package com.rogerio.ejbproject;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean implements HelloBeanRemote, HelloBeanLocal {

	@Override
	public String getHelloMessage() {
		return "Hello!";
	}

   

}

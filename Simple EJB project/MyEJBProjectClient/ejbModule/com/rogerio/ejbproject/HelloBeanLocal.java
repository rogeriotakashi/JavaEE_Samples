package com.rogerio.ejbproject;

import javax.ejb.Local;

@Local
public interface HelloBeanLocal {
	public String getHelloMessage();
}

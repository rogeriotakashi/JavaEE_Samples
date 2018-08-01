package com.rogerio.ejbproject;

import javax.ejb.Remote;

@Remote
public interface HelloBeanRemote {
	public String getHelloMessage();
}

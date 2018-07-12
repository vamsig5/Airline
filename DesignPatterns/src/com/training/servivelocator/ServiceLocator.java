package com.training.servivelocator;

public class ServiceLocator {
private static Cache cache;
static{
	cache=new Cache();
}
public static Service getService(String jndiName){
	Service service=cache.getService(jndiName);
	if(service!=null){
		return service;
	}
	InitialContext context=new InitialContext();
	Service service2=(Service)context.lookup(jndiName);
	cache.addService(service2);
	return service2;
	
}
}

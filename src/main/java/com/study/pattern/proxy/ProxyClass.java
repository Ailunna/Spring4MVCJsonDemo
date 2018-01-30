package com.study.pattern.proxy;

public class ProxyClass implements IProxyInterface{
	
	IProxyInterface realProxier = null;

	@Override
	public void proxyMethod(String proxier) {		
		System.out.println("I am a proxy class, I will invoke th ereal proxier now.");
		if(realProxier == null) {
			realProxier = new RealProxier();
		}
		realProxier.proxyMethod(proxier);
	}

}

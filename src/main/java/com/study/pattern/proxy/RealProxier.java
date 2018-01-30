package com.study.pattern.proxy;

public class RealProxier implements IProxyInterface{

	@Override
	public void proxyMethod(String proxier) {
		System.out.println("The real proxier is:"+proxier);
	}

}

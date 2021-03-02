package com.assessment2.q1.singleton;

public class InitializationLazyDriver {
	
	public static void main(String[] args) {
		InitializationLazy instance1 =InitializationLazy.getInstance();
		InitializationLazy instance2 = InitializationLazy.getInstance();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}

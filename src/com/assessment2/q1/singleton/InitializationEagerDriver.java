package com.assessment2.q1.singleton;

public class InitializationEagerDriver {
	public static void main(String[] args) {
		InitializationEager instance1 = InitializationEager.getInstance();
		InitializationEager instance2 = InitializationEager.getInstance();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}

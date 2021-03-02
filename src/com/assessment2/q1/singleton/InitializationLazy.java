package com.assessment2.q1.singleton;

public class InitializationLazy {
	private static InitializationLazy instance;

	private InitializationLazy() {
	}

	// Lazy Initialization of the instance
	public static InitializationLazy getInstance() {
		if (instance == null) {
			instance = new InitializationLazy();
		}
		return instance;
	}

}

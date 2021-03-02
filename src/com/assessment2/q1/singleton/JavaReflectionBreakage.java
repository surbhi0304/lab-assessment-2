package com.assessment2.q1.singleton;

public class JavaReflectionBreakage {
	private static JavaReflectionBreakage instance;

	private JavaReflectionBreakage() {
	}

	// Lazy Initialization of the instance
	public static JavaReflectionBreakage getInstance() {
		if (instance == null) {
			instance = new JavaReflectionBreakage();
		}
		return instance;
	}

}

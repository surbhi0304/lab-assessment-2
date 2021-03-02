package com.assessment2.q1.singleton;

public class ClonningIssue {
	
	private static ClonningIssue instance;

	private  ClonningIssue(){}

	// Lazy Initialization of the instance
	public static  ClonningIssue getInstance() {
		if (instance == null) {
			instance = new ClonningIssue();
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

}

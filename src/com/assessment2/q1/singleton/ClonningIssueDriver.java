package com.assessment2.q1.singleton;

final class ClonningIssueDriver {
	 public static void main(String[] args) throws CloneNotSupportedException, Exception {
		 ClonningIssue instance1 =ClonningIssue.getInstance();
		 ClonningIssue instance2 = (ClonningIssue) instance1.clone();
	        System.out.println( instance1.hashCode());
	        System.out.println( instance2.hashCode());
	    }
	

}

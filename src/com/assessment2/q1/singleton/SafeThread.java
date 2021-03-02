package com.assessment2.q1.singleton;


public class SafeThread {
	
private static SafeThread  instance;
    
    private SafeThread(){}
    
    //by using synchronized only one thread can use this method at a time
    public static synchronized SafeThread  getInstance(){
        if(instance == null){
        	instance = new SafeThread();
        }
        return instance;
    }
	

}

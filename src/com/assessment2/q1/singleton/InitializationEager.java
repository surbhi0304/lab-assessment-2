package com.assessment2.q1.singleton;

public class InitializationEager {
	//Instance of Singleton Class is created at the time of class loading
    private static final InitializationEager  instance = new InitializationEager();
    
    private InitializationEager(){
    
    }

    public static InitializationEager getInstance(){
        return instance;
    }

}

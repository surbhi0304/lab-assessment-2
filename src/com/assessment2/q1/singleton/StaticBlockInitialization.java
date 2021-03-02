package com.assessment2.q1.singleton;


public class StaticBlockInitialization {
private static StaticBlockInitialization  instance;
    
    private StaticBlockInitialization (){}
    
    //static block initialization
    static{
            instance = new StaticBlockInitialization ();
    }
    
    public StaticBlockInitialization  getInstance(){
        return instance;
    }

}

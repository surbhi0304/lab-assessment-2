package com.assessment2.q1.singleton;

import java.io.Serializable;

/**
 * @author VE00YM240
 *
 */
public class SerializationUsingSingleton implements Serializable{
  
	private static final long serialVersionUID = 2181911282009285542L;


	private SerializationUsingSingleton(){}
    
    private static class Singleton{
        private static final  SerializationUsingSingleton instance = new  SerializationUsingSingleton();
    }
    
    public static SerializationUsingSingleton getInstance(){
        return Singleton.instance;
    }
	
    
    //to overcome the serialization problem in singleton design pattern
    protected Object readResolve() {
    	return getInstance();
    	}

}


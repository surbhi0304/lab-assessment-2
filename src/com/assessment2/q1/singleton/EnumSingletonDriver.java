package com.assessment2.q1.singleton;

import java.lang.reflect.InvocationTargetException;


public class EnumSingletonDriver {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EnumSingleton instance1 = EnumSingleton.INSTANCE;
		EnumSingleton instance2 = EnumSingleton.INSTANCE;
        
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

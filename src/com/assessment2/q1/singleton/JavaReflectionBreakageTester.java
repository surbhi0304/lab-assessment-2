package com.assessment2.q1.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class JavaReflectionBreakageTester {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		JavaReflectionBreakage instance1 = JavaReflectionBreakage.getInstance();
		JavaReflectionBreakage instance2 = null;
       
		
		//can call private constructor of the class
        @SuppressWarnings("rawtypes")
		Constructor[] constructors = JavaReflectionBreakage.class.getDeclaredConstructors();
         constructors[0].setAccessible(true);
 		
         instance2 = (JavaReflectionBreakage) constructors[0].newInstance(); 
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

	

}

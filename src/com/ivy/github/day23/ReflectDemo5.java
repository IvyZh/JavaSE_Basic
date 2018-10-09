package com.ivy.github.day23;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class ReflectDemo5 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class clz1 = Person.class;
		int modifiers = clz1.getModifiers();
		System.out.println(modifiers);
		String m = Modifier.toString(modifiers);
		System.out.println(m);
	}

}

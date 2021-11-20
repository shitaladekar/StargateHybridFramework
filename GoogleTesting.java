package testCases;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.Keys;

import commonTest.WebInteractable;


public class GoogleTesting{
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	  WebInteractable obj = new WebInteractable();
	  
	  Class cls = obj.getClass();
	  
	  Method[] methods = cls.getMethods();
	  for (Method m : methods) {
		if(m.getName().equals("launchBrowser"))
			m.invoke(obj, "Chrome");
	}
	}

}


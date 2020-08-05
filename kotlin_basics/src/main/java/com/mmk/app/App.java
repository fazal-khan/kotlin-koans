package com.mmk.app;

import java.util.Objects;

/**
 * Hello world!
 */
public class App {
  
  public static String greet(String name) {
      if(Objects.isNull(name) || name.trim().length() == 0){
        return "Hello";
      }
      return "Hello " + name + "!";
  }

  public static String hello(String name){
  		if(name == null || name.trim().length() == 0) return null;
  		return "hello " + name;
  }

}

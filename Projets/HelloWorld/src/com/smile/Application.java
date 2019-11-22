package com.smile;

public class Application {

	public static String hello (String  name) {
		return "hello World" + ' ' + name;
	}
	public static void main(String[] args) {
		Voiture v = new Voiture("Model S", 300);
			System.out.println(v);
	}
	

	

}

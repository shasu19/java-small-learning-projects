package com.shasu19p.main;

// Pass to this class using VM arguments section during running this in Eclipse
// -Dadd.title=Hello
public class SystemPropertyReading {

	public static void main(String[] args) {

		String titlePassed = System.getProperty("add.title");

		System.out.println(titlePassed);
	}
}
package com.shasu19p.main;

// Pass to this class using VM arguments section during running this in Eclipse
// -Dadd.title=Hello
public class EnvironmentVariablesReading {

	public static void main(String[] args) {

		String javaHome = System.getenv("JAVA_HOME");

		System.out.println(javaHome);
	}
}
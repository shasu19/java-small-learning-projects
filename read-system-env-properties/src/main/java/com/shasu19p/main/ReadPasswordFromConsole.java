package com.shasu19p.main;

import java.io.Console;

/**
 *  Read password from console
 * */
public class ReadPasswordFromConsole {

	public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
           System.err.println("unable to obtain console");
           return;
        }

        String prompt = "Enter password";
        String password = new String(console.readPassword(prompt));

        System.out.println(password);
	}
}
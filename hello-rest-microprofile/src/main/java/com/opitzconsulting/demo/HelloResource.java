package com.opitzconsulting.demo;

/**
 * Created by svb on 21.08.18.
 */
public class HelloResource {

    private String message;

    public HelloResource(String pName) {

	message = String.format("Hello, %s!", pName);
    }

    public String getMessage() {
	return message;

    }

    public void setMessage(String pMessage) {
	message = pMessage;
    }
}

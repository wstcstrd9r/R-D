package com.research.validateip;

public class Driver {

	public static void main(String args[]) {
		ValidateIP validateIP = new ValidateIP();
		validateIP.validate("0.165.666.1");
		validateIP.validate("0.0165.254.1");
		validateIP.validate("0.165.243.-1");
		validateIP.validate(".165.243.1");
		validateIP.validate("1024.0..1");
		validateIP.validate("192.168.1.1");
		
	}

}

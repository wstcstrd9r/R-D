package com.research.validateip;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class ValidateIP {

	public void validate(String IP) {
		// Logger can be used instead of  detailedReport
		ArrayList<String> detailedReport = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(IP, ".");
		boolean isValid = false;
		int count = st.countTokens();
		int i = 1;
		
		if (count != 4) {
			detailedReport.add("Invalid number of octet.");
			isValid=false;
		} else {
			while (st.hasMoreTokens()) {
				String token=st.nextToken();
				
				// Check for string character size, 0 in front is invalid) 
				if(token.length()>3 || token.length()<1){
					detailedReport.add(i + " octet is not valid");
					isValid = false;
					break;
				}
				// Validate range
				if(!checkRange(token)){
					detailedReport.add(i + " octet is not valid");
					isValid = false;
					break;
				} 
				
				else {
					detailedReport.add(i + " octet is valid");
					isValid = true;
				}
				i++;
			}
		}
		Iterator<String> itr = detailedReport.iterator();
		if (isValid) {
			System.out.println("\n Valid IP Address: "+IP);
		} else {
			System.out.println("\n Invalid IP Address: "+IP+" , please see the details below:");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}

	public boolean checkRange(String tok) {
		boolean isValid=false;
		try{
			// Check if the string is valid int and under range
			int value = Integer.parseInt(tok);
			if (value >= 0 && value <= 255) {
				isValid=true;
			}
		} catch (Exception e){
			// Log the parse error
			isValid=false;
		}
		return isValid;
	}

}

package com.research.java.json;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;



public class JsonDriver {
	int data2;
	String data1;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Json " + returnJson() );
		returnGson();
	}

	public static String returnJson() {
		JSONObject json = new JSONObject();
		try {
			json.put("city", "Mumbai");
			json.put("country", "India");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 
		String output = json.toString();
		return output;
	}
	public static void returnGson() {
		String jsonString = "";
		JSONObject json = new JSONObject();
		try {
			json.put("data1", "Mumbai");
			json.put("data2", "100");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 Gson gson = new Gson();
		 JsonDriver jDriver = gson.fromJson(json.toString(), JsonDriver.class);
		 System.out.println(jDriver);
		 

	}
	@Override
	public String toString() {
		this.display();
		return "TestJsonFromObject [data1=" + data1 + ", data2=" + data2 + "]";
	}
	public void display(){
		System.out.println("Data1 = " + data1 + " Data2 = " + data1);
	}
}

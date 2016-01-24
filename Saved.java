package com.bhaskar.ds.dtw;

import java.util.HashMap;
import java.util.Map;

public class Saved {

	private Map<Integer, String> saved = new HashMap<Integer, String>();
	
	public Saved(){
		saved.put(1,"One");
		saved.put(2,"Two");
		saved.put(3,"Three");
		saved.put(4,"Four");
		saved.put(5,"Five");
		saved.put(6,"Six");
		saved.put(7,"Seven");
		saved.put(8,"Eight");
		saved.put(9,"Nine");
		
		saved.put(11,"Eleven");
		saved.put(12,"Twelve");
		saved.put(13,"Thirteen");
		saved.put(14,"Fourteen");
		saved.put(15,"Fifteen");
		saved.put(16,"Sixteen");
		saved.put(17,"Seventeen");
		saved.put(18,"Eighteen");
		saved.put(19,"Nineteen");
		
		saved.put(10,"Ten");
		saved.put(20,"Twenty");
		saved.put(30,"Thirty");
		saved.put(40,"Fourty");
		saved.put(50,"Fifty");
		saved.put(60,"Sixty");
		saved.put(70,"Seventy");
		saved.put(80,"Eighty");
		saved.put(90,"Ninety");
		
		saved.put(100,"Hundred");
		saved.put(1000,"Thousand");
		saved.put(100000,"Lakh");	
		
	}

	public void getSaved(Integer digit) {
		System.out.println(saved.get(digit));
	}

}

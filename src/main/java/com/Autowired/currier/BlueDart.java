package com.Autowired.currier;

import com.Autowired.Logistic.Logistic;

public class BlueDart implements Logistic {
	
	public BlueDart() {
		
		System.out.println("BlueDart Constractor.............");
		
	}
	
	
	
	@Override
	public String trackId(int orderId) {
		
		String status=" BlueDart is assingn your order and Id is: "+orderId;
		
		return status;
	}


}

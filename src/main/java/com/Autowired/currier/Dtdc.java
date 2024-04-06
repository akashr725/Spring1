package com.Autowired.currier;

import com.Autowired.Logistic.Logistic;

public class Dtdc implements Logistic {
	
	public Dtdc() {

		System.out.println("Dtdc Constractor............");
	}

	@Override
	public String trackId(int orderId) {
		
		String status=" Dtdc is assingn your order and Id is: "+orderId;
		
		return status;
	}

}

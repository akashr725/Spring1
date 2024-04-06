package com.Autowired.Impl;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.Autowired.Logistic.Logistic;

public class Flifkart {
	
	
//	@Autowired
//	@Qualifier("bdart")
//	@Qualifier("dtdc")
	private Logistic logistic;
	
	//using setter method
	
//	@Autowired
//	@Qualifier("dtdc")
//	public void setLogistic(Logistic logistic) {
//		this.logistic = logistic;
//	}
	
	//using aurbitary method
	
	//@Autowired
	//@Qualifier("bdart")
//	public void getLogistic(Logistic logistic) {
//		this.logistic=logistic;
//	}
	@Autowired
//	@Qualifier() using qualifier this location is not valid in constractor injection
	public Flifkart( @Qualifier("dtdc") Logistic logistic) {
		
		this.logistic=logistic;
		
	}


	public String delivery(String item[], float price[]) {
		
		float billAmnt=0.0f;
		
		for(float itemprice: price) {
			
			billAmnt +=itemprice;
		}
		
		int orderId=new Random().nextInt(10000);
		
		String status=logistic.trackId(orderId);
		
		String TfinalStatus="Your purchase Item is: "+ Arrays.toString(item) + " Total Bill: "+billAmnt+status;
		
		
		return TfinalStatus;
	}

}

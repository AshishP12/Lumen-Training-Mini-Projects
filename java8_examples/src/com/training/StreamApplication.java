package com.training;


import java.util.*;

import com.training.model.CreditCard;
import com.training.services.CreditCardService;

public class StreamApplication {

	public static void main(String[] args) {
	
		
		List<CreditCard> cards= new ArrayList<CreditCard>();
		
		cards.add(new CreditCard(10233,"Ramesh", 3789, 800000));
		cards.add(new CreditCard(10234,"uamesh", 4789, 50000));
		cards.add(new CreditCard(10235,"amesh", 5789, 70000));
		cards.add(new CreditCard(10236,"Naveen", 6789, 60000));
		cards.add(new CreditCard(10237,"Ashish", 7789, 900000));
		
		CreditCardService service=new CreditCardService(cards);
		
		service.usingFilterAndMap();
	}

}

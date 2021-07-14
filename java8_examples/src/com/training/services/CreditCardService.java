package com.training.services;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.training.model.CreditCard;
public class CreditCardService {

	public List<CreditCard> cards;

	public CreditCardService(List<CreditCard> cards) {
		super();
		this.cards = cards;
	}

	public List<CreditCard> getCards() {
		return cards;
	}

// using filter and map
public void usingFilterAndMap() {
	
	//using filter alone= Only one intermediate operator and one terminal operator
	
	List<CreditCard> creditLimitMoreThan5lakh=
			this.cards.stream()
			.filter((card)->card.
					getCreditLimit()>500000).collect(toList());
	
      creditLimitMoreThan5lakh.forEach(System.out::println);
      
      List<String> namesOfMoreThan5Lakh=
    		  this.cards.stream()
    		  .filter(card -> card.getCreditLimit()<500000)
    		  .map(card -> card.getCardHolderName()).collect(toList());
      
      System.out.println("Credit limit Less than 5lakh");
      namesOfMoreThan5Lakh.forEach(System.out::println);
}

// colect to map

public void collectingToUtilMap() {
	Map<String,Long> teleCallingList =this.cards.stream()
			.filter(card -> card.getCreditLimit()<500000)
			.collect(toMap(CreditCard::getCardHolderName, CreditCard::getPhoneNumber));
	
	
	// use the entry set method and print the complete map



}


/*public void findMinimumCreditLimit() {
	
	for(Entry<String, Long> entry:teleCallingList.entrySet())
	{
	String key = entry.getKey();
	Long value = entry.getValue();
	System.out.println(key+ "= "+value);
	}

public void findMaximumCreditLimmit() {
	
	
	Optional<CreditCard> maxCard =yhis.cards.stream()
			.max(Comporator)
}*/




	

	
}

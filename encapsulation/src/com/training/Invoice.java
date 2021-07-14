package com.training;

public class Invoice {
	
	private int invoiceno;
	private double rateperunit;
	private double qunatity;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceno, double rateperunit, double qunatity) {
		super();
		this.invoiceno = invoiceno;
		this.rateperunit = rateperunit;
		this.qunatity = qunatity;
	}
	public int getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}
	public double getRateperunit() {
		return rateperunit;
	}
	public void setRateperunit(double rateperunit) {
		this.rateperunit = rateperunit;
	}
	public double getQunatity() {
		return qunatity;
	}
	public void setQunatity(double qunatity) {
		this.qunatity = qunatity;
	}
	
	
	public void setRatePerUnit(double ratePerUnit) {
        if(ratePerUnit>0) {
        this.rateperunit = ratePerUnit;
        } else {
            throw new RuntimeException("Invalid Rate Per Unit");
        }
       
    }

		
	public double calculate() {
		
		double amount =this.rateperunit* this.qunatity;
		return amount-discount();
	}
	
	private double discount() {
		
		double discount =100.00;
		if(this.rateperunit>10000)
		{
			discount=5000;
		}
		return discount;
	}
	
	}
	

package com.sonalake.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class CalculatorImpl implements Calculator 	//Implements class from Calculator interface
{
  /**
   * {@inheritDoc}
   */
  WordToNumber wtn=new WordToNumber();  		//Create an instance of WordToNumber class
  public String calculate(String request) 	    //Override method calculate
  {
	  	
		 if(request==null)						//If argument is null then throw an exception IllegalArgumentException()
		 {
			throw new IllegalArgumentException();		//Throw an exception
		 }else 
		 if(request.contains("plus"))				//If request has plus string then perform addition operation
		 {
				
				 	String asplit[]=request.split("plus");	//Split string into two parts
				 	String first=asplit[0];					//First number
					String last=asplit[1];					//Second number
					String sfirstall = "";
					String ssecondall = "";		
					String[] firstall=first.split(" ");		//Split first number by space
					String[] secondall=last.split(" ");		//Ex:- sixty seven => sexty and seven
					for(String i:firstall )
						sfirstall=sfirstall+" "+i;				
					for(String j:secondall )
						ssecondall=ssecondall+" "+j;
					
					long f=0;
					long s=0;
					try
					{
						f= WordToNumber.parse(sfirstall.trim());	//Call static parse method from class WordToNumber
						s=WordToNumber.parse(ssecondall.trim());	//Will convert word to number (sixty seven => 67)
					}
					catch(Exception e)
					{}
					long lresult=f+s;								//Addition of two (numbers)
					if(lresult==0||f>100||s>100)					//Check for limit should not be greater than 100
					{
						throw new IllegalArgumentException();
					}
					return NumberToWord.convert(lresult);		//Return addition numbers into english language string

		 }
		 else if((request.contains("multiplied")))				//If request has multiplied string then perform multiplication operation
		 {
			 
			    //Rest of the part is same but written for multiplication
			 	String asplit[]=request.split("multiplied by");
			 	String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;
				
				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e)
				{}
				long lresult=f*s;
			
				if(lresult==0||f>100||s>100)
				{
					throw new IllegalArgumentException();
				}
				return NumberToWord.convert(lresult).trim();
		 }
		 else if((request.contains("divided")))				//If request has divided string then perform divide operation
		 {
				String asplit[]=request.split("divided by");
			 	String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;
				
				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e)
				{}
				long lresult=f/s;
				long reminder=f%s;	
				
				System.out.println(f+" "+s);
				System.out.println(lresult);
				
				if(lresult==0||f>1000||s>1000)
				{
					throw new IllegalArgumentException();
				}
				String m=NumberToWord.convert(lresult).trim();
				if(reminder!=0)
				{
					String sremi=NumberToWord.convert(reminder).trim();
					return m+" with a remainder of "+sremi;
				}
				return NumberToWord.convert(lresult).trim();
		 }		
		 else if((request.contains("minus")))	//If request has minus string then perform substraction operation	
		 {
				String asplit[]=request.split("minus");
			 	String first=asplit[0];
				String last=asplit[1];	
				String sfirstall = "";
				String ssecondall = "";		
				String[] firstall=first.split(" ");
				String[] secondall=last.split(" ");
				for(String i:firstall )
					sfirstall=sfirstall+" "+i;
				for(String j:secondall )
					ssecondall=ssecondall+" "+j;
				
				long f=0;
				long s=0;
				try
				{
					f= WordToNumber.parse(sfirstall.trim());
					s=WordToNumber.parse(ssecondall.trim());
				}
				catch(Exception e)
				{}
				long lresult=f-s;
				
			
				if(lresult==0||f>100||s>100)
				{
					throw new IllegalArgumentException();
				}
				String m;
				if(lresult<0)
				{
					lresult=Math.abs(lresult);
					m=NumberToWord.convert(lresult).trim();
					return "minus "+NumberToWord.convert(lresult).trim();
				}				
				return NumberToWord.convert(lresult).trim();
		 }
		 else
		 {

				throw new IllegalArgumentException();
		 }
  } 
  
}

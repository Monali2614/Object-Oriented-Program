package com.yash.traning.opps.homeAssignemnt.problem11;

import java.util.Date;

public class Test
{

	public static void main(String[] args) 
	{
		Date dob = new Date(1991,11, 15);
		Date doj = new Date(2022, 07, 07);
         Employee e = new Employee(101,"priya","pune", 50000, dob, doj);
         System.out.println(e);
         
         
	}

}

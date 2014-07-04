package com.github.greg.whitebelt2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class App
{

	public static void main(String[] args)
	{
		System.out.println("Hello Jozi");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("The time now is: " + now);
		
		LocalDateTime future = now.plus(10, ChronoUnit.DAYS);
		System.out.println("The time 10 days from now is " + future); 
	}
}

package com.Switch;

public class SwitchExample {

	public static void main(String[] args) {
		
		int WeekDay=5;
		
		System.out.println(WeekDay);
		
		switch (WeekDay)
    {
		case 1:	
		System.out.println(" MonDay ");
		break;
		case 2:
		System.out.println(" TuesDay ");
		break;
		case 3:
		System.out.println(" WednessDay ");
		break;
		case 4:
		System.out.println(" ThursDay ");
		break;
		case 5:
		System.out.println(" FriDay ");
		break;
		case 6:
	    System.out.println(" SaturDay ");
		break;	
		case 7:
		System.out.println(" SunDay ");
		break;
		default:
		System.out.println(" Expression not matching with any of the case ");
		
    }	
	}
}

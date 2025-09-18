package com.tnsif.Interface;

public class mainClass {

	public static void main(String[] args) {
		jio j = new jio();
		j.call();
		j.sms();
		
		samsung sm = new samsung();
		sm.call();
		sm.sms();
	}

}

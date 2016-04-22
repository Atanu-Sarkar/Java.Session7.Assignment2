package com.acadgild.session.seven;

public class NumberFormat {

	public static void main(String[] args) {
		try {
			int num=Integer.parseInt ("XYZ") ;
			 System.out.println(num);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Number format exception occurred");
			e.printStackTrace();
			
		}

	}

}


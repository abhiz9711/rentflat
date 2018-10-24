package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {
	static Scanner sc=null;

	static IFlatRegistrationService cliSer = null;
	public static void main(String[] args) {
		
	
		cliSer =   new FlatRegistrationServiceImpl();
		
		sc=new Scanner(System.in);
		int choice=0;
		while(true)
		{
			System.out.println("1.Register Flat\n");
			System.out.println("2.Exit\n");
			
			System.out.println("Enter ur choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:registerflatDetails();break;
		
			
			case 2: 
			default : System.exit(0);
	}

		}	
}
	private static void registerflatDetails() {
		ArrayList<Integer> arr = cliSer.getAllOwnerIds();
		System.out.println("Existing owner IDS are:"+cliSer.getAllOwnerIds());
		System.out.println("please enter ownerid from above list:");
		int ownid = sc.nextInt();
		System.out.println("Select flat type (1-1BHK, 2-2BHK): ");
		int in = sc.nextInt();
		String flat = null;
		switch (in) {
		case 1:
			flat = "1BHK";
			break;
			
		case 2:
			flat = "2BHK";
			break;

		default:
			break;
		}
		System.out.println("Enter flat area in sq.ft: ");
		int area = sc.nextInt();
		System.out.println("Enter desired rent amount: ");
		float rent = sc.nextFloat();
		System.out.println("Enter desired deposit amount Rs. ");
		float deposit = sc.nextFloat();
		
		
		FlatRegistrationDTO dto = new FlatRegistrationDTO(ownid, flat, area, rent, deposit);
		
		for(Integer i : arr){
			if(ownid == i){
				cliSer.registerFlat(dto);
			}
		}
		
		
	}
}

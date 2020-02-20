package com.epam.NewYearTask;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> req=new ArrayList<String>();
		int ans=1,ch=1,start=0;
		NewYGift[] g=new NewYGift[6];
		g[0]=new Handmade("GulabJamun",125);
		g[1]=new Handmade("Kaju Barfi ",150);
		g[2]=new Handmade("Halwa",40);
		g[3]=new Chocolates("Munch",30);
		g[4]=new Chocolates("Snikers",15);
		g[5]=new Chocolates("MilkyBar",20);
		do {
			System.out.println("Welcome!!");
			System.out.println("gifts ------------quantity");
			System.out.println("Sweets");
			for(int i=0;i<3;i++) {
				System.out.println((i+1)+"."+g[i].getGName()+"              "+g[i].getGQty());
			}
			System.out.println("Chocolates");
			for(int i=3;i<6;i++) {
				System.out.println((i+1)+"."+g[i].getGName()+"                "+g[i].getGQty());
			}
			System.out.println("-------------------------------------");
			System.out.println("1.Enter the range  of your choice to view gifts");
			System.out.println("2.Enter your choice to wrap the gift packs");
			System.out.println("Enter your choice:");
			ans=sc.nextInt();
			if(ans==1) {
				System.out.println("Enter the range between which you want the gifts");
				start=sc.nextInt();
				//System.out.println("Available gifts are:");
				for(int i=0;i<6;i++) {
					if(g[i].getGQty()>=start) {
						req.add(g[i].getGName());
					}
				}
				if(req.isEmpty()) {
					System.out.println("Sorry,no gifts found in the given range!!");
					//break;
				}
				else {
					System.out.println("Gifts available in the given range are:");
					Iterator<String> itr=req.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}   
					float weight=  start/10;
					System.out.println("Total weight of sweets selected"+weight+"kg");
				}
			}
			else if(ans==2) {
				sc.nextLine();
				System.out.println("Enter the name of the gift:");
				String c=sc.nextLine();
				int h=0;
				for(int j=0;j<6;j++) {
					if(g[j].getGName().equalsIgnoreCase(c)) {
						g[j].wrap();
						h=1;
						break;
					}
				}
				if(h==0)
				{
					System.out.println("entered gift not found! please enter the available gift");
				}
			}
			else {
				System.out.println("Enter a valid chocie");
			}
			System.out.println("Do you want to continue?Yes(1)/No(0)");
			ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Visit again!!");
		sc.close();
	}
}
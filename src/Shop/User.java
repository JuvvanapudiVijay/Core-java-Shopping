package Shop;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Display obj=new Display();
		Shopping shop=obj.shopping();
		Scanner Scan=new Scanner(System.in);
		System.out.println("WELCOME TO THE SHOPPING MALL");
		System.out.println("WE PROVIDE MENS / WOMENS CLOTHWEAR CHOOSE ONE OF THEM MEN/WOMEN");
		String reply1=Scan.next();
		if(reply1.equalsIgnoreCase("Women")) {
			shop.women();
			System.out.println("WHAT WOULD YOU LIKE TO CHOOSE");
			System.out.println("CHOOSE A NUMBER");
			int i=Scan.nextInt();
			if(i==1) {
				System.out.println("Ladies Kurtha Rs : 500");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price(money,i);
				shop.exit();
			}
			else if(i==2) {
				System.out.println("Ladies Tops Rs : 250");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price(money,i);
				shop.exit();
			}
			else if(i==3) {
				System.out.println("Ladies Jeans Rs : 600");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price(money,i);
				shop.exit();
			}
			else if(i==4) {
				System.out.println("Ladies Gold Chains Rs : 10000");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price(money,i);
				shop.exit();
			}
			else if(i==5) {
				System.out.println("Ladies MakeUp Kit Rs : 1000");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price(money,i);
				shop.exit();
			}
			else if(i==6) {
				System.out.println("Ladies Shoes Rs : 1200");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price(money,i);
				shop.exit();
			}
		}
		else {
			if(reply1.equalsIgnoreCase("no")) {
				System.out.println("OK...THANK YOU VISIT US AGAIN");
			}
		}
		
		String reply2 =Scan.next();
		if(reply1.equalsIgnoreCase("men")) {
			shop.men();
			System.out.println("WHAT WOULD YOU LIKE TO CHOOSE");
			System.out.println("CHOOSE A NUMBER");
			int i=Scan.nextInt();
			if(i==1) {
				System.out.println("Mens Shirts Rs : 400");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price1(money,i);
				shop.exit();
			}
			else if(i==2) {
				System.out.println("Mens Pants Rs : 600");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price1(money,i);
				shop.exit();
			}
			else if(i==3) {
				System.out.println("Mens Jeans Rs : 600");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price1(money,i);
				shop.exit();
			}
			else if(i==4) {
				System.out.println("Mens Gold Chain Rs : 10000");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price1(money,i);
				shop.exit();
			}
			else if(i==4) {
				System.out.println("Mens Watch Rs : 700");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price1(money,i);
				shop.exit();
			}
			else if(i==5) {
				System.out.println("Mens Shoes Rs : 1200");
				System.out.println("ENTER THE AMOUNT");
				double money=Scan.nextDouble();
				shop.price1(money,i);
				shop.exit();
			}
		}
		else {
			if(reply1.equalsIgnoreCase("no")) {
				System.out.println("OK...THANK YOU VISIT US AGAIN");
			}
		}
		
	}

}

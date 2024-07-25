package Shop;

public class Display {
	private class Shop implements Shopping{
		Price d=new Price();
		public void women() {
			System.out.println("1.Ladies Kurthas : "+d.getKurthas());
			System.out.println("2.Ladies Tops : "+d.getTops());
			System.out.println("3.Ladies Jeans : "+d.getJeans());
			System.out.println("4.Ladies Gold Chains : "+d.getChain());
			System.out.println("5.Ladies Makeup Kits: "+d.getMakeup());
			System.out.println("6.Ladies Shoes : "+d.getShoes());
		}
		public void men() {
			System.out.println("1.Men Shirts : "+d.getShirts());
			System.out.println("2.Men Pants : "+d.getPants());
			System.out.println("3.Mens Jeans : "+d.getJeans());
			System.out.println("4.Mens Gold Chains : "+d.getChain());
			System.out.println("5.Mens Watch : "+d.getWatch());
			System.out.println("6.Mens Shoes : "+d.getShoes());
		}
		public void exit() {
			System.out.println("Thank You Visit Our Shopping Mall Again");
		}
		public void price(double money,int i) {
			if (i == 1) {
				if( money >=550) {
				double change = money - d.getKurthas();
				System.out.println("Your Change Is :" + change);
				}else {
					System.out.println("insufficient balance");
			}
			}
			else if(i==2) {
				if(money>=250) {
					double change = money - d.getTops();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==3) {
				if(money>=600) {
					double change = money - d.getJeans();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==4) {
				if(money>=1000) {
					double change = money - d.getMakeup();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==5) {
				if(money>=1200) {
					double change = money - d.getShoes();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
		}
		
		public void price1(double money, int i) {
			if (i == 1) {
				if( money >=400) {
				double change = money - d.getShirts();
				System.out.println("Your Change Is :" + change);
				}else {
					System.out.println("insufficient balance");
			}
			}
			
			else if(i==2) {
				if(money>=600) {
					double change = money - d.getPants();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==3) {
				if(money>=600) {
					double change = money - d.getJeans();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==4) {
				if(money>=10000) {
					double change = money - d.getChain();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==5) {
				if(money>=700) {
					double change = money - d.getWatch();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			else if(i==6) {
				if(money>=1200) {
					double change = money - d.getShoes();
					System.out.println("Your Change Is :" + change);
				}
				else {
					System.out.println("insufficient balance");
				}
			}
			
		}
	}
	public Shopping shopping() {
		return new Shop();
	}
}

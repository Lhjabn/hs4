package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone = 8000;
		double price;
		switch(zone) {
		case 1: 
			System.out.println("Zone 1");
			price = 2;
			break;
		case 2:
			System.out.println("Zone 2");
			price = 2.35; // price+0.35; 
			break;
			
		case 3:
			System.out.println("Zone 3");
			price = 2.85; //price+0.5;
			break;
		case 4:
			System.out.println("Zone 4");
			price = 2.85; // price+0.5;
			break;
		case 5:
			System.out.println("Zone 5");
			price =  3.55; //price+0.7;
			break;
		default:
			System.out.println("Zone 6");
			price = 4;
		}
		System.out.println(price);
	}
	}


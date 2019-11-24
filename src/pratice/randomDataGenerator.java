package pratice;

import java.util.Random;

public class randomDataGenerator {

	public static void main(String[] args) {
		
	Random r = new Random();
	
	System.out.println("random  number is "+ r.nextInt());
	System.out.println("random  number is "+ r.nextFloat());
	System.out.println("random  number is "+ r.toString());
	System.out.println("random  number is "+ r.getClass());
	
	String email = "email"+r.nextInt()+"@gmail.com";
	System.out.println(email);
	}

}

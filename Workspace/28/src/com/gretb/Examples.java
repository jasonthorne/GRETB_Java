package com.gretb;

public class Examples {
	
	//Regards Garbage collection. Freeing of memory previously used by a variable.
	static void ex1() {
		
		Dog spot = new Dog(3, "spot");
		Dog rex = new Dog(3, "rex");
		Dog lassie = new Dog(3, "lassie");
		
		//prints memory addresses:
		System.out.println("spot lives in: " + spot);
		System.out.println("rex lives in: " + rex);
		System.out.println("lassie lives in: " + lassie);
		
		rex=spot; //both vars now point to spot. rex obj is no longer referenced and is ready for garb collection (dereferencing by reassignment).
		
	}
	
	static void ex2() {
		
		int age=4;
		String name="Tom";
		boolean isMale = true;
		double weight = 4.5;
		
		//two dogs with the same name and age:
		Dog spot = new Dog(age, name);
		Dog lassie = new Dog(age, name);
		
		System.out.println("Are dogs the same dog? " + (spot==lassie));
		System.out.println("Are dogs equal? " + (spot.equals(lassie))); //it checks spot's Dog class for an equals method, if not there then goes and checks object class
		
		//two cats with the same values:
		Cat tibbles = new Cat(age, name, weight, isMale);
		Cat mog = new Cat(age, name, weight, isMale);
		Cat tabby = new Cat(5, "tabby", 45.6, false);
		
		System.out.println("Using overriden equals in Cat class: " + tibbles.equals(mog)); //check the vars of these cats. (we have overridden the equals method to check these values)
	}

}

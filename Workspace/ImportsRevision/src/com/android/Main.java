package com.android;

//Import below (com.apple.Cat) is importing the statics AND non statics of the Cat class. We only have direct acces to the public variables. 
//If we were in a derived(sub) class, then we'd also have access to the protected variables.
import com.apple.Cat; //Imports both STATICS and non statics +++++++++++++

import com.windows.*; //Imports all of the public members of the com.windows package (from ALL classes in that package)




public class Main {

	public static void main(String[] args) {
		
		Cat myCat = new Cat(); //accessing the public Cat constructor
		
		//accessible members:
		System.out.println(myCat.name); //public String name
		myCat.eat();
		Cat.fight(); //accessing the STATIC fight method in a static way
		myCat.fight(); //accessing the STATIC fight method in a NON static way (not recommended!)
		
		
		
		
		/*
		 * We have imported all the PUBLIC members from the Daisy class. 
		 * The only one we have acces to is the static int "daisyCounter".
		 * This will cause the static 
		 */
		System.out.println(Daisy.daisyCounter); //this WILL RUN the static initialisers! 
		//If you access the static var of a class, all of the static initialisers will then run. (they only run ONCE each session).
		System.out.println(Daisy.daisyCounter); //static initialisers WONT be called here, as they already were above. 

	}

}
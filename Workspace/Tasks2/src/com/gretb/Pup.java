package com.gretb;

public class Pup extends Dog{ //doesn't need to extend Dog, but seems odd not to! :D 
	
	
	//puppy vars:
    String id =""; //puppy id
    String breed = ""; //breed of pup
    String sex = ""; //sex of pup
    String colour = ""; //colour of pup
    String temperament = ""; //temperament of pup
    double weight = 0.0;  //weight of pup

	
    //constructor:
	public Pup(String id, String breed, String sex, String colour, String temperament, double weight) {
		this.id = "Puppy_" + id; //assign an id to pup
		this.breed = breed;
		this.sex = sex;
		this.colour = colour;
		this.temperament = temperament;
		this.weight = weight;
		
		//print values of pup (formatting weight to one decimal place):
		System.out.println(this.id + ": " + this.breed + ", " + this.sex + ", " + this.colour + ", " + this.temperament + ", " + String.format("%.1f", this.weight));
		
	}

}

package com.association;

public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Honda hondaAmaze=new Honda();
          hondaAmaze.setColor("white");
          hondaAmaze.setSpeed(120);
          hondaAmaze.carDetails();
          hondaAmaze.hondaMusicPlayer();
          hondaAmaze.hondastartEngine();
          Honda hondaJazz= new Honda();
          hondaJazz.setColor("black");
          hondaJazz.setSpeed(130);
          hondaJazz.carDetails();
          hondaJazz.hondastartEngine();
	}

}

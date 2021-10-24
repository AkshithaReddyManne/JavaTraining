package com.association;

public class Honda extends Car {
   public void hondastartEngine()
   {
	   CarEngine hondaeng=new CarEngine();
	   hondaeng.enginestarts();
   }
   public void hondaMusicPlayer()
   {
	   MusicPlayer hplayer=new MusicPlayer();
	   hplayer.carMusicPlayer();
   }
}

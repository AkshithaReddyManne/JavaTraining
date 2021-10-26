package com.assoc;

public class UndergradStudent extends Student{
 private int year;

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
 public void Year()
 {
	 System.out.println("Year is "+year );
	 Branch b=new Branch();
		Society s=new Society();
		b.studiesBranch();
		s.collegeSociety();
 }
}

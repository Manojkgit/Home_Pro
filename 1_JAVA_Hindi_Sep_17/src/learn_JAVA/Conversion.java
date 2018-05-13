package learn_JAVA;

import javax.sound.midi.Synthesizer;

public class Conversion {
     int i=100;
      String college = "KNMIT";
      static String college1 = "ITS";
      
	public static void main(String args[]) {
		String a= "123";
		int aa=Integer.parseInt(a);
		System.out.println(args[aa]);
		String num = "123";
		int number = Integer.parseInt(num);
		int num2 = 2;
		System.out.println(number+num2);
		Conversion c = new Conversion();
		c.i=200;
		System.out.println(c.i);
		System.out.println(Conversion.college1);
		System.out.println(college1);
		College nc = new College();
		c.nameOfCollege();
		nc.collegeClass();
		
	}
	
	
       public void nameOfCollege(){
    	   System.out.println(college);
       }
	

}


   class College{
	   public void collegeClass(){
		   Conversion c1 = new Conversion();
		   System.out.println(c1.college);
	   }
   }
package learn_JAVA;

public class ProtectedClass {
   protected static class Protect{
	   int i=10;
	   int j=15;
	  protected void addTwoNum(int i,int j){
		  System.out.println(i+j);
	  }
   }
   
   public static void main(String a[]){
	   Protect p=new Protect();
	   p.addTwoNum(3, 12);
       
   }
}

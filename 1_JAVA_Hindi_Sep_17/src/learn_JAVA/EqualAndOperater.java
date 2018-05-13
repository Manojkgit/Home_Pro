package learn_JAVA;

public class EqualAndOperater {

	public static void main(String[] args) {
	  int a = 10;
	  int b = 10;
	  String a1 = new String("manoj");
	  String a2 = new String("manoj");
	  if(a==b){
		  System.out.println("A and B both are same..");
	  }else{
		  System.out.println("Not same...");
	  }
	  if(a1==a2){
		  System.out.println("Both Same");
	  }else if(a1.equals(a2)){
		  System.out.println("Thats true...");
	  }else{
		  System.out.println("Not match");
	  }
	}
}

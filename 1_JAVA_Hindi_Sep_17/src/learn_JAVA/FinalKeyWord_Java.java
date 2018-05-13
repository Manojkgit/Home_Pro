package learn_JAVA;

public class FinalKeyWord_Java extends ABC{
	public static void main(String[] args) {
        ABC a=new ABC(6);
	}
}

class ABC extends BBB{
	public ABC(){
		System.out.println("A");
	}
    public ABC(int i){
    	super(i);
		System.out.println("A para");
	}
}
class BBB{
	public BBB(){
		System.out.println("ADD BBB");
	}
	public BBB(int i){
		System.out.println("ADD I BBB PARA");
	}
}

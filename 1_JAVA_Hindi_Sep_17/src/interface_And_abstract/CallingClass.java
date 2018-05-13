package interface_And_abstract;

public class CallingClass{

	public static void main(String[] args) {
		Abstract_Class_Bank acB=new HDFC_Back_Extends_Class();
		// According to Static polymorphism, User Can not call Child class method.
		acB.creditCard();
		acB.debitCard();
		acB.loan();
		
		HDFC_Back_Extends_Class hc=new HDFC_Back_Extends_Class();
		hc.creditCard();
		hc.debitCard();
		// According to Dynamic polymorphism, User Can call Child class method and Parent Method.
		hc.HDFC_Credit();  
		hc.loan();
		
		// You cannot create object of Abstract Class and Cannot create Object of Interface also.
	}
}

package learn_JAVA;

public class ConstructionCallingClass {
	private int x;
	{   
		System.out.println("Sarita... " + x);
		x=10;
	}
	public ConstructionCallingClass(){
		int b=10;int c=19;
		int a=b+c;
		System.out.println("Manoj Kushwaha.... " +x);
		System.out.println(a); 
	}
	int i=10,j=20;
	public static void main(String[] args){
	    ConstructionCallingClass ccc=new ConstructionCallingClass();
		System.out.println(ccc.i+ccc.j);
	}
}

package learn_JAVA;

public class this_KeyWord {

	public static void main(String[] args) {
	   AA aa=new AA(5);
	   aa.show();
	}

}

class AA{
	private int a;
	public AA(int a){
		this.a=a;
	}
	
	public void show(){
		System.out.println(a);
	}
}

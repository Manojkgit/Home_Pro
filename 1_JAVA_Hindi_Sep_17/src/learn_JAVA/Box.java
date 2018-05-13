package learn_JAVA;

public class Box {
	
	static int length,beadth,height;
	public static void setBoxDimansion(int l,int b,int h){
		length=l;beadth=b;height=h;
		
 }

	public void showDimantion(){
		System.out.println("L - " + length);
		System.out.println("B - " + beadth);
		System.out.println("H - " + height);
	}

}

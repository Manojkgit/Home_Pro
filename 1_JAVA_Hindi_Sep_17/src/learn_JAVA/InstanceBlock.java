package learn_JAVA;

public class InstanceBlock {
	static int count=0;{
		count++;
	}

	public static void main(String[] args) {
		InstanceBlock ib1 = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock(10);
		InstanceBlock ib3 = new InstanceBlock(10.5);
		System.out.println("No of total object in class -- Instance block is -  " + count);
	}
	
	public InstanceBlock() {
	   System.out.println("1");
	}
	public InstanceBlock(int i) {
		   System.out.println("2");
		}
	public InstanceBlock(double d) {
		   System.out.println("1.5");
		}
}

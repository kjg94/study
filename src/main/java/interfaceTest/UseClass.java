package interfaceTest;

public class UseClass {
	public static void main(String[] args) {
		InterTest intest = new Add();
		int rtn = intest.value(10,20,30,40,50);
		System.out.println(rtn);
		intest = new sub();
		rtn = intest.value(10,20,30,40,50);
		System.out.println(rtn);
		
	}
}

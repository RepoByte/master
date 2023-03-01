
public class test {
//	public static String man  = Out();
	static {
		Out();
	}
	public static String Out(){
		System.out.println("This is from first method");
		return "";
	}

	public static void main(String[] args) {
		System.out.println("This is from main");

	}
	public static void out2(){
		System.out.println("This is from second method");
	}
}

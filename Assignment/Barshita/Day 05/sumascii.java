
public class sumascii {

	public static void main(String[] args) {
		String str = "Sarah";
		int sum = 0;	 
		for (char ch : str.toCharArray()) {
			sum += (int) ch;
		}
	
		System.out.println(sum);;
	}
//	public static void main(String[] args) {
//		String name = "Barshita";
//		int result = sumascii(name);
//		System.out.println("sum of ascii values in ' " + name + "" result)
//	}  
	
}


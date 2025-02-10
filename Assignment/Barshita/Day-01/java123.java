package java123;

public class java123 {

	public static void main(String[] args) {
		int spaces = 40;
		for(int line=1; line<10; line++) {
			for(int i=0; i<spaces; i++) System.out.print(" ");
			for(int i=1; i<=line; i++) System.out.print(i);
			for(int i=line-1; i>=1; i--) System.out.print(i);
			System.out.println();
			spaces--;
		}
	}

} 

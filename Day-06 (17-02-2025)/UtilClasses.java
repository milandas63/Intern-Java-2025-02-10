import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilClasses {
	final int age = 25;

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("MM/dd/yy HH:mm:ss a");
		System.out.println(sdf.format(now));
	}

	public void print() {
		//	age = 45;
	}
}

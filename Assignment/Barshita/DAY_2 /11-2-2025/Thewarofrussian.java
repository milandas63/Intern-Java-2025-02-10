package strings;

public class Thewarofrussian {

	public static void main(String[] args) {
        String text = "The War of Russian and Ukrain ends";
        String words[] = text.split(" ");
        
        // Find max length
        int size = 0;
        for(String x: words) {
        	if(size<x.length()) {
        		size = x.length();
        	}
  	    }

        for(String x:words) {
			System.out.println("* " + stretch(x,size) + " *");
			
			
		}
	}

	private static String stretch(String data,int width) {
		String value = data;
		for(int i=data.length(); i<width; i++) value = value+" "; 
		return value;		
	}
	
}


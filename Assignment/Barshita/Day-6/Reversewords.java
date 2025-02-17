
public class Reversewords {

	public static void main(String[] args) {
		String sentence = "I am working in the engineering college";
		// Split the sentence into words
        String[] words = sentence.split(" ");
	// Reverse the words 
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
        	reversedSentence.append(words[i]).append(" ");
        	
        }
	// Trim and print the result 
        System.out.println(reversedSentence.toString().trim());
	
	}
	}



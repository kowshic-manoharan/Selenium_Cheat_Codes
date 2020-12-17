package trickyConcepts;

public class Test {
	
	public static void main(String[] args) {
		
		String actual = "    kowshic";
		
		//Trim the spaces
		String trim = actual.trim();
		System.out.println(trim);
		
		//reverse the string
		String reverse = "";
		for(int i=actual.length()-1; i>=0; i--) {
			reverse = reverse + actual.charAt(i);
		}
		System.out.println(reverse);
		
		//print the odd index chars
		for(int i=actual.length()-1; i>=0; i--) {
			if(i%2==0) {
				System.out.print(actual.charAt(i));
			}
		}
		
		//make few chars as upper
		for(int i=actual.length()-1; i>=0; i--) {
			if(i%2==0) {
				char upper = actual.toUpperCase().charAt(i);
				System.out.print(upper);
			}
		}
		
	}

}

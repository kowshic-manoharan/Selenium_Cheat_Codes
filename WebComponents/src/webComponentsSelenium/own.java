package webComponentsSelenium;


import java.util.Scanner;

public class own {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array :: ");
	      int size = sc.nextInt();
	      String myArray[] = new String[size];
	      System.out.println("Enter elements of the array (Strings) :: ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.next();
	      }
	    //  System.out.println(Arrays.toString(myArray));
	      StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < myArray.length; i++) {
	          sb.append(myArray[i]);
	          sb.append(" ");
	       }
	      String str = sb.toString();
	      System.out.println(str);
	      char c[] = str.toCharArray();
	      System.out.println("The first character of each word: ");
	      String f = "";
	      for (int i=0; i < c.length; i++) {
	         // Logic to implement first character of each word in a string
	         if(c[i] != ' ' && (i == 0 || c[i-1] == ' ')) {
	        	 System.out.print(c[i]);
	           
	         }
	         f=  String.valueOf(c[i]);
	      }
	      
         
          String s1 = "mt";
	      if(f == s1) {
	    	  System.out.println("Hi");
	      }
	     
	      
	}

}

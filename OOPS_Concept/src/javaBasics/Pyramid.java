/**
 * 
 */
package javaBasics;

/**
 * @author kowshic
 *
 */
public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("Normal pyramid decreasing");
		int k=1;
		for(int i=0;i<4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		
		System.out.println("Normal pyramid increasing");
		int z =10;
		for(int i=0;i<4;i++) {
			for(int j=1;j<=1+i; j++) {
				System.out.print(z);
				System.out.print("\t");
				z--;
			}
			System.out.println("");
		}
		
		System.out.println(" pyramid ");
		for(int i=0;i<4;i++) {
			for(int j=1;j<=1+i; j++) {
				System.out.print(j);      //1;1<1 1
				System.out.print("\t");
			}
			System.out.println("");
		}
		
		System.out.println(" 3rd table pyramid ");
		int o = 3;
		for(int i=0;i<3;i++) {
			for(int j=1;j<=1+i; j++) {
				System.out.print(o);
				System.out.print("\t");
				o=o+3;
			}
			System.out.println("");
		}
	}
}

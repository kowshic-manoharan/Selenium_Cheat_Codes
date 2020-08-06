/**
 * 
 */
package javaBasics;

/**
 * @author kowshic
 *
 */
public class MultiDimensionalArrayMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		for(int i = 0; i < 2; i++) // row
		{
			System.out.println("");
			for(int j = 0; j < 3; j++) // coloumn
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
		}

	}

}

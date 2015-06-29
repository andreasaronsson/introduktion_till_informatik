import java.io.*;
/**
 * ett program som lobbar in tal i en matris och skriver ut dem
 *
 */
public class W24 {

	public static void main(String [] args){
		int totsum=0;
		int[][]matrix=new int[6][6];
		int[]col=new int [6];
		int[]row=new int [6];
	
		for (int vert=0;vert<6;vert++) {
			for (int horis=0;horis<6;horis++) {
				matrix[vert][horis]=(int)((Math.random()*1000)%100);
				col[vert]=col[vert]+matrix[vert][horis];
				row[horis]=row[horis]+matrix[vert][horis];
				totsum=totsum+matrix[vert][horis];
			}
		}
		for (int vert=0;vert<6;vert++) {
			for (int horis=0;horis<6;horis++) 
				System.out.print(matrix[vert][horis]+"\t");
			System.out.println(col[vert]);
		}
		for (int horis=0;horis<6;horis++) 
			System.out.print(row[horis]+"\t");
		System.out.println(totsum);

	}
}

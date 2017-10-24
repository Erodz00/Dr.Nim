import java.util.Scanner;

/*
19,126,10308,5,0,0:0:0:0: 	STANDARD
64,192,10308,5,0,0:0:0:0:	MANIA
STD: First number is the x coordinate
STD: Second number is the y coordinate from the top being 0
STD & Mania; 3rd Number is the time in milliseconds, 10308 being 10:308 seconds
 */

public class Standard2Mania {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = 1932;																					//Notes in the Map without spinners
		for (int i = 0; i < input; i++) {
			String Standard = scan.nextLine();
			int column = 64;
			
			String[] parts = Standard.split(",");
			String part0 = parts[0]; 
			String part1 = parts[1];
			String part2 = parts[2];
			
			String part3 = parts[3];
			String part4 = parts[4];
			String part5 = parts[5];
			
			if(Standard.contains("L") || Standard.contains("P") || Standard.contains("B")) {
				column= 196;
			}
			
			if(i==0) {
				String Mania = column + ",192," + parts[2] + ",5,0,0:0:0:0:";
				System.out.println(Mania);
			} else { 
				String Mania = column + ",192," + parts[2] + ",1,0,0:0:0:0:";
				System.out.println(Mania);
			}	
		}
	}
}
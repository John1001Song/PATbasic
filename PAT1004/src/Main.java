import java.util.*;

public class Main {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int size;
		size = scan.nextInt();
		
		String[][] marks = new String[size][3];
		String[][] max = new String[1][3];
		String[][] min = new String[1][3];
		
		int maxMark = 0;
		int minMark = 100;

		for(int i = 0; i < size; i++){
			
			String[][] currentStd = new String [1][2];
			int currentStdMark;
			currentStd[0][0] = scan.next();
			currentStd[0][1] = scan.next();
			currentStdMark = scan.nextInt();
			
			if (currentStdMark >= maxMark){
				max[0][0] = currentStd[0][0];
				max[0][1] = currentStd[0][1];
				maxMark = currentStdMark;
			}
			
			if(currentStdMark <= minMark){
				min[0][0] = currentStd[0][0];
				min[0][1] = currentStd[0][1];
				minMark = currentStdMark;
			}
			
		}
		
		System.out.println(max[0][0] + " " +max[0][1]);
		System.out.println(min[0][0] + " " + min[0][1]);
				
		}
	
	
}

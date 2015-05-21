import java.util.*;

public class Main {

	public static void main(String args[]){
	
		int coeff, expo;
		boolean start = true;
		
		Scanner input = new Scanner(System.in);
		
		while(input.hasNextInt()){
			
			coeff = input.nextInt();
			expo = input.nextInt();
			
			coeff = coeff*expo;
			expo--;
			
			if(coeff == 0){
				continue;
			}else{
				if(start){
					start = false;
				}else{
					System.out.print(" ");
				}
				System.out.print(coeff + " " + expo);
			}	
			
		}
		
		if(start)
			System.out.print("0 0");
		
	}
	
}


// borrow code from https://github.com/biaobiaoqi/CPractice/blob/master/PAT/basiclevel/BLPAT1010.java


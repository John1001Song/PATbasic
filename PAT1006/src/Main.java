import java.util.*;

public class Main {

	public static void main(String args[]){
		String x;
		Scanner input = new Scanner(System.in);
		x = input.nextLine();
		
		int bai = 0, shi = 0, ge = 0;
		
		if(x.length() == 3){
			bai = x.charAt(0) - '0';
			shi = x.charAt(1) - '0';
			ge = x.charAt(2) - '0';
		}
		
		if(x.length() == 2){
			shi = x.charAt(0) - '0';
			ge = x.charAt(1) - '0';
		}
		
		if(x.length() == 1){
			ge = x.charAt(0) - '0';
		}
		
		for(int i = 0; i < bai; i++){
			System.out.print("B");
		}
		
		for(int i = 0; i < shi; i++){
			System.out.print("S");
		}
		
		for(int i = 0; i < ge; i++){
			System.out.print(i+1);
		}
		
		
	}
}

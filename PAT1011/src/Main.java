import java.util.*;

public class Main {

	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int a, b, c;
		
		for(int i = 1; i <= size; i++){
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			
			if (a + b > c){
				System.out.printf("Case #%d: true\n", i);
			}else{
				System.out.printf("Case #%d: false\n", i);
			}	
		}	
	}	
}
	/*
	public static void main(String args[]){
		
		int size;
		Scanner input = new Scanner(System.in);
		size = input.nextInt();
		int geshu = size*3;
		
		int[] nums = new int[geshu];
		
		for(int i = 0; i < geshu; i++){
			nums[i] = input.nextInt();
		}
		
		for(int i = 0; i < size; i++){
			if(nums[i*3] + nums[i*3+1] > nums[i*3+2]){
				System.out.println("Case #" + (i+1) + ": true");
			}else{
				System.out.println("Case #" + (i+1) + ": false");
			}
		}
		
		
	}
	*/


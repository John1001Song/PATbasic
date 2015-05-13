import java.util.*;
import java.math.*;
public class Main {
	
	public static boolean isPrime(int num){
		int div;
		div = num - 2;
		
		if(num > 10000){
			double temp = Math.sqrt(num);
			div = (int) temp;
		}
		
		if((div%2) == 0)
			div = div+1;
		
		for(int i = 0; div > 1; i++){
			if((num % div) == 0){
				return false;
				}else{
					div = div - 2;
				}
		}
		return true;
	}
	
	
	public static void main(String args[]){
		int upper;
		Scanner input = new Scanner(System.in);
		upper = input.nextInt();
		
		
		
		int prime = 3;
		int count = 0;
		
		for(int i = 0; prime+2 <= upper; i++){
			if(prime + 2 > upper)
				break;
			if((isPrime(prime+2) == true) && isPrime(prime) == true)
				count++;
			prime = prime + 2;
		}
		
		System.out.println(count);
	}
}

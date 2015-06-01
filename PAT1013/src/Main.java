import java.util.*;

public class Main {
	
	public static boolean isPrime(int num){
		
		if(num == 2)
			return true;
		
		if(num%2 == 0)
			return false;
		
		for(int i=3; i*i<=num; i+=2){
			if(num%i == 0)
				return false;
		}
		
		return true;
	}
	
	
	public static void main(String args[]){
		
	int count = 0;
	int size = 0;
	int left = 0, right = 0;
	//int index = 0;
	Scanner input = new Scanner(System.in);
	left = input.nextInt();
	right = input.nextInt();
	size = right - left + 1;
	
	int[] primes = new int[size];
	
	for(int i=2; count<=right; i++){
		if(isPrime(i) == true){
			count++;
			if(count >= left && count <= right){
				primes[count-left] = i;
			}
			}
	}
	
	for(int i = 0; i < primes.length; i++){
		System.out.print(primes[i]);
		if((i+1)%10 == 0){
			System.out.println("");
		}else{
			if(i != primes.length-1){
				System.out.print(" ");
			}
		}
	}
		
		
	}
}

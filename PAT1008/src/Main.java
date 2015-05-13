import java.util.*;
import java.math.*;

public class Main {

	public static int[] swap(int shift, int len, int[] array){
		
		for(int i = 0; i + shift < len; i++){
			int temp = array[i];
			array[i] = array[i+shift];
			array[i+shift] = temp;
		}
		
		for(int i = len-shift; i < shift; i++){
			int temp = array[(i+shift)%len];
			array[(i+shift)%len] = array[i];
			array[i] = temp;
		}
		
		return array;
	}
	
	
	public static void main(String args[]){
		int len, shift;
		
		Scanner input = new Scanner(System.in);
		len = input.nextInt();
		shift = input.nextInt();
		int diff = Math.abs(len - shift);
		
		int[] array =  new int[len];
		
		for(int i = 0; i < len; i++){
			array[(i+shift)%len] = input.nextInt();
		}
		
		//array = swap(shift, len, array);
		
		
		for(int i = 0; i < len; i++){
			if(i == 0){
				System.out.print(array[i]);
			}else{System.out.print(" " + array[i]);}
		}
		
		
		
	}
	
}

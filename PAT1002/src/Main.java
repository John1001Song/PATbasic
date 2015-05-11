import java.util.*;


public class Main {

	public static void main(String args[]){
		Integer sum = 0;
		
		Scanner input = new Scanner (System.in);
		
		String Str1 = input.nextLine();
		
		int[] num = new int[Str1.length()];
		
		for (int i=0; i<Str1.length(); i++){
			num[i] = Str1.charAt(i) - '0';
			//This is a vital step to get num[i] and should remember it!
			//avoid type transfer and use the difference between two char
			//This method returns the character located at the String's specified index. The string indexes start from zero.
			//http://www.tutorialspoint.com/java/java_string_charat.htm
		}
		
		for (int k=0; k<num.length; k++){
			sum += num[k];
		}
		
		//System.out.println(sum);
		
		String tempSum = sum.toString();
	
		char[] output = new char[tempSum.length()];
		
		for(int l=0; l<tempSum.length(); l++){
			output[l] = tempSum.charAt(l);
		}
		
		for (int i=0; i<output.length; i++){
			char t = output[i];
			
			switch(t){
			case '0':
				System.out.print("ling");
				break;
			case '1':
				System.out.print("yi");
				break;
			case '2':
				System.out.print("er");
				break;
			case '3':
				System.out.print("san");
				break;
			case '4':
				System.out.print("si");
				break;
			case '5':
				System.out.print("wu");
				break;
			case '6':
				System.out.print("liu");
				break;
			case '7':	
				System.out.print("qi");
				break;
			case '8':
				System.out.print("ba");
				break;
			case '9':	
				System.out.print("jiu");
				break;	
			}
			
			if (i<output.length-1){
				System.out.print(" ");
			}
		}
		
		
		
		}
	
	
		
}
//this small program is more concerned about type converting
//question: difference between int[] and List<Integer>
//further more, ArrayList and List

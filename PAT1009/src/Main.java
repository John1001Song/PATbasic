import java.util.*;

public class Main {

	public static void main(String args[]){
		String sen;
		Scanner input = new Scanner(System.in);
		sen = input.nextLine();
		int numOfWord = 0;
		
		for(int i = 0; i < sen.length(); i++){
			if (sen.charAt(i) == ' ')
				numOfWord++;
		}
		numOfWord = numOfWord+1;
		
		if(numOfWord == 1){
			System.out.print(sen);
		}else{
		
		
		String[] box = new String[numOfWord];
		int[] indexs = new int[numOfWord-1];
		int tempIndx = 0;
		int tempIndxForBox = 1;
		for(int i = 0; i < sen.length(); i++){
			if(sen.charAt(i) == ' '){
				indexs[tempIndx] = i;
				tempIndx++;
			}
		}
		
		for(int i = 0; i <= indexs.length; i++){
			String tempStr;
			if(i == 0){
				box[0] = sen.substring(0, indexs[0]);
			}else if(i == indexs.length){
				box[tempIndx] = sen.substring(indexs[numOfWord-2]+1);
					}else
						{
							tempStr = sen.substring(indexs[i-1]+1, indexs[i]);
							box[tempIndxForBox] = tempStr;
							tempIndxForBox++;
						}
		}
	
		for(int i = box.length-1; i >= 0; i--){
			if(i == box.length-1){
				System.out.print(box[i]);
			}else{System.out.print(" " + box[i]);}
		}
		
		}
	}
	
}

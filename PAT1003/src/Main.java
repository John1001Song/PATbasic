import java.util.*;


public class Main {
	
	public static boolean checkNumOfA(String str){
		
		int indexP=0, indexT=0;
		int countLA=0, countMA=0, countRA=0;
		
		for(int i = 0; i < str.length(); i++){
			if (str.charAt(i) == 'P')
				indexP = i;
			if (str.charAt(i) == 'T')
				indexT = i;
		}
		countLA = indexP;
		countMA = indexT -indexP - 1;
		countRA = str.length() - 1 - indexT;
		
		if(indexP >= indexT)
			return false;
		
		if(countRA == countLA*countMA && countMA > 0){
			return true;
		}else return false;
	}
	
	public static boolean checkIfOnePAT(String str){
		
		int countP = 0, countA = 0, countT = 0;
		for(int i = 0; i < str.length(); i++){
			char currentChar = str.charAt(i);
			if (currentChar == 'P')
				countP ++;
			if (currentChar == 'A')
				countA ++;
			if (currentChar == 'T')
				countT ++;
		}
		if(countP == 1 && countA >=1 && countT == 1){
		return true;
		}else return false;
		
	}
	
	public static boolean checkOnlyPAT(String str){
		
		for(int i = 0; i < str.length(); i++){
			char currentChar = str.charAt(i);
			if(currentChar != 'P' && currentChar != 'A' && currentChar != 'T')
				return false;
		}
		return true;
	}
	
	public static boolean finalCheck(String str){
		
		//boolean initialCheck = false;
		
		if (checkOnlyPAT(str) != true || checkIfOnePAT(str) != true)
			return false;
		
		if (checkNumOfA(str) == true){
			return true;
		}else return false;
	}
	
	
	public static void main(String args[]){
	
		//ArrayList<String> linkedPAT = new ArrayList<String>();
		//ArrayList<String> linkedSolution = new ArrayList<String>();
		
		
		int inputNum;
		Scanner a = new Scanner(System.in);
		inputNum = a.nextInt();
		
		String[] linkedPAT = new String[inputNum];
	//	String[] linkedSolution = new String[inputNum];
		
		for(int i=0; i<inputNum; i++){
			linkedPAT[i] = a.next();
		}
		/*
		 * this is for test if above code can correctly scan the num and string */
		//for(int i = 0; i < linkedPAT.length; i++){
		//System.out.println(linkedPAT[i]);
		//}
		
		
		for(int i = 0; i < linkedPAT.length; i++){
			String currentStr = linkedPAT[i];
			boolean currentBool = finalCheck(currentStr);
			if (currentBool == true){
				//linkedSolution[i] = "YES";
				//System.out.println(linkedSolution[i]);
				System.out.println("YES");
			}else System.out.println("NO");
				//{linkedSolution[i] = "NO";
					//System.out.println(linkedSolution[i]);
					//}
				
		}
		
		
		
		
	}
}
//减少内存的方法：用零时str接收当前scan的内容，然后finalCheck(str)，接着print出结果。再循环下一个scan的内容。就不需要使用linkedPAT这个Array了。
//http://examples.javacodegeeks.com/core-java/util/arraylist/arraylist-in-java-example-how-to-use-arraylist/
//important code source about array list!!!
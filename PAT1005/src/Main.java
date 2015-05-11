/*1005. 继续(3n+1)猜想 (25)

时间限制 400 ms
内存限制 65536 kB
代码长度限制 8000 B
判题程序 Standard
作者 CHEN, Yue

卡拉兹(Callatz)猜想已经在1001中给出了描述。在这个题目里，情况稍微有些复杂。
当我们验证卡拉兹猜想的时候，为了避免重复计算，可以记录下递推过程中遇到的每一个数。
例如对n=3进行验证的时候，我们需要计算3、5、8、4、2、1，则当我们对n=5、8、4、2进行验证的时候，就可以直接判定卡拉兹猜想的真伪，而不需要重复计算，
因为这4个数已经在验证3的时候遇到过了，我们称5、8、4、2是被3“覆盖”的数。我们称一个数列中的某个数n为“关键数”，如果n不能被数列中的其他数字所覆盖。
现在给定一系列待验证的数字，我们只需要验证其中的几个关键数，就可以不必再重复验证余下的数字。你的任务就是找出这些关键数字，并按从大到小的顺序输出它们。

输入格式：每个测试输入包含1个测试用例，第1行给出一个正整数K(<100)，第2行给出K个互不相同的待验证的正整数n(1<n<=100)的值，数字间用空格隔开。
输出格式：每个测试用例的输出占一行，按从大到小的顺序输出关键数字。数字间用1个空格隔开，但一行中最后一个数字后没有空格。

输入样例：
6
3 5 6 7 8 11
输出样例：
7 6
*/
import java.util.*;
import java.math.*;
import java.io.*;
public class Main {
	
	public static int nextCoverNum(int currentkey){
	
			if(currentkey % 2 == 0){
				currentkey = currentkey/2;	
			}else{currentkey = (3*currentkey+1)/2;}
					
		return currentkey;
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		List<Integer> keys = new ArrayList<Integer>();
		List<Integer> res = new ArrayList<Integer>();
		
		for(int i = 0; i < size; i++){
			keys.add(input.nextInt());
		}
		
		for(int i = 0; i < size; i++){
			int currentkey = keys.get(i);
			while(currentkey != 1){
				currentkey = nextCoverNum(currentkey);
				for(int k = 0; k < size; k++){
					if(keys.get(k) == currentkey){
						keys.set(k, 1);
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < keys.size(); i++){
			for(int k = 0; k < keys.size()-i; k++){
				if(k != keys.size()-i-1)
					if(keys.get(k+1) > keys.get(k)){
						int t = keys.get(k+1);
						keys.set(k+1, keys.get(k));
						keys.set(k, t);
					}	
			}
		}
		
		res.addAll(0, keys);
		int[] res2 = new int[100];
		int res2Len = 0; 
		
		for(int i = 0; i < res.size(); i++){
			if (res.get(i) != 1)
				res2[res2Len++] = res.get(i);
		}
		
		for(int i = 0; i < res2.length; i++){
			if(res2[i] != 0)	
				if (i == 0){
					System.out.print(res2[0]);
					}else{
						System.out.print(" ");
						System.out.print(res2[i]);}
		}
	}	
}
//先得到所有的覆盖数 然后再把原数列与其比较 重复即可剔除 array范围不够
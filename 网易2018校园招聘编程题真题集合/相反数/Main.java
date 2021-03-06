import java.io.*;

/*
链接：https://www.nowcoder.com/questionTerminal/ef6262d0381d42ebbe22d8a8554fef01
来源：牛客网

为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。
例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,
之后再加上原先的数,我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,
前缀零将会被忽略。例如n = 100, 颠倒之后是1. 

输入描述：
	输入包括一个整数n,(1 ≤ n ≤ 10^5)
	
输出描述：
	输出一个整数,表示n的相反数
	
示例1：
输入
	1325
输出
	6556
*/

public class Main {
     
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
         
        String verseLine = "";
        for(int i=line.length()-1; i>=0; i--) {
            verseLine += line.charAt(i);
        }
        int verseN = Integer.parseInt(verseLine);
        System.out.println(n+verseN);
         
    }
     
}
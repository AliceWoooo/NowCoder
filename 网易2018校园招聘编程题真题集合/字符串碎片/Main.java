import java.io.*;
import java.text.*;

/*
链接：https://www.nowcoder.com/questionTerminal/97bc02e432bb4744a9e666b6c93d4479
来源：牛客网

一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。
例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。牛牛现在给定一个字符串,
请你帮助计算这个字符串的所有碎片的平均长度是多少。

输入描述:
	输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')


输出描述:
	输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。

	如样例所示: s = "aaabbaaac"
	所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25
示例1
输入
	aaabbaaac
输出
	2.25
*/

public class Main {
     
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
         
        int number = 0;
        char preLetter = 'A';
        for(int i=0; i<line.length(); i++) {
            char letter = line.charAt(i);
            if(letter!=preLetter) {
                preLetter = letter;
                number++;
            }
        }
        DecimalFormat df = new DecimalFormat(".00");
        double result = (double) line.length()/number;
        System.out.println(df.format(result));
    }
     
}
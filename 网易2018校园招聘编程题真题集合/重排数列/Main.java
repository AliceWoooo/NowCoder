import java.io.*;

/*
链接：https://www.nowcoder.com/questionTerminal/a461395335c946c5b409e79847796cd0
来源：牛客网

小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
牛博士给小易出了一个难题:
对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。 
输入描述:
	输入的第一行为数列的个数t(1 ≤ t ≤ 10),
	接下来每两行描述一个数列A,第一行为数列长度n(1 ≤ n ≤ 10^5)
	第二行为n个正整数A[i](1 ≤ A[i] ≤ 10^9)

输出描述:
	对于每个数列输出一行表示是否可以满足牛博士要求,如果可以输出Yes,否则输出No。
	
示例1
输入
	2
	3
	1 10 100
	4
	1 2 3 4
输出
	Yes
	No
*/

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int t = Integer.parseInt(line);
        for(int i=0; i<t; i++) {
            String line1 = br.readLine();
            String line2 = br.readLine();
            String[] line2Split = line2.split(" ");
            int n = Integer.parseInt(line1);
            int numOf0 = 0; int numOf1=0; int numOf2=0;
            for(int j=0;j<n;j++) {
                int a = powerOf2(Integer.parseInt(line2Split[j]));
                if(a==0) {
                    numOf0++;
                }
                else if(a==1) {
                    numOf1++;
                }
                else {
                    numOf2++;
                }
            }
            if(numOf0<=numOf2) {
                System.out.println("Yes");
            }
            else if(numOf0==numOf2+1&&numOf1==0) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
     
    public static int powerOf2(int n) {
        int count = 0;
        while(n % 2 == 0) {
            n = n/2;
            count++;
        }
        return count;
    }
}
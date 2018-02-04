import java.util.*;

/*
链接：https://www.nowcoder.net/questionTerminal/b53bda356a494154b6411d80380295f5
来源：牛客网

小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
1、将a_i放入b序列的末尾
2、逆置b序列
小易需要你计算输出操作n次之后的b序列。 
输入描述:
	输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
	第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。

输出描述:
	在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
示例1
输入
	4
	1 2 3 4
输出
	4 2 1 3
*/
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        if(n%2==0) {
            for(int i=n-1; i>=0; i-=2) {
                System.out.print(a[i]+" ");
            }
 
            for(int j=0; j<n-2; j+=2) {
                System.out.print(a[j]+" ");
            }
            System.out.println(a[n-2]);
        }
        else {
            for(int i=n-1; i>=0; i-=2) {
                System.out.print(a[i]+" ");
            }
 
            for(int j=1; j<n-2; j+=2) {
                System.out.print(a[j]+" ");
            }
            System.out.println(a[n-2]);
        }
         
    }
}
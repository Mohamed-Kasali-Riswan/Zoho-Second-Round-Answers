package second;

//16. Find the result subtraction, multiplication, division of two integers using + operator.
//Input: 6 and 4
//output:
//addition 6+4 = 10, subtraction 6+(-4) = 2, multiplication = 24, division = 1
//Input : -8 and -4
//Output:
//addition -8+(-4) = -12, subtraction (-8)+(-(-4)) = -4, multiplication = 32, division = 2

public class NoOperatorOperation_Qs16 {

	public static void main(String[] args) {
		
//		int a=6,b=4;
		int a=-8,b=-4;
		
		int add = a+b;
		int sub = a+(~b+1);
		boolean isNegate = (a<0 && b>0) || (a>0 && b<0);
		a=Math.abs(a);
		b=Math.abs(b);
		int mul=0, div=0;
		for(int i=0;i<b;i++) {
			mul+=a;
		}
		while(a>=b) {
			a=a+(~b+1);
			div++;
		}
		System.out.println(add);
		System.out.println(sub);
		System.out.println(isNegate?-mul:mul);
		System.out.println(isNegate?-div:div);
	}

}

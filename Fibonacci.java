package Fibonacci;
import java.util.*;

public class Fibonacci {
	public int fib(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fibonacci fb=new Fibonacci();
		System.out.println("Enter a value ");
		int n=sc.nextInt();
		System.out.println("fib("+n+")="+fb.fib(n));	
	}

}

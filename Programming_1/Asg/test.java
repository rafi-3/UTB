package Asg;

public class test {
	public static void main(String[] args) {
		int n = 1;
		System.out.println("Before the call, x is " + n);
		increment(n);
		System.out.println("After the call, x is " + n);
		}
	public static void increment(int n) {
		n++;
		System.out.println("n inside the method is " + n);
		}

     }


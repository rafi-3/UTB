package Practice5;

public class quiz1 {
	public static void main(String[] args) {
		System.out.println("Sum from 20 to 30 is " + sum(1, 10));
		  
		System.out.println("sum from 2 to 20 is " + sum(2,20));
		  }
	
	public static int sum(int i1, int i2) {
		int sum = 0;
		 for (int i = i1; i <= i2; i++)
		 sum += i;
		 return sum;
		 }		 
}

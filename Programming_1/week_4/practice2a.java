package week_4;

public class practice2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		int a=1, b=2;
		System.out.println("the result is " +(a+b));
//		a
		System.out.println(("(a) ")+ s1.equals(s2));
//		b
		System.out.println(("(b) ")+ s1.equals(s3));
//		c
		System.out.println(("(c) ")+ s1.compareTo(s2));
//		d
		System.out.println(("(d) ")+ s2.compareTo(s3));
//		e
		System.out.println(("(e) ")+ s2.compareTo(s2));
//		f
		System.out.println(("(f) ")+ s1.charAt(0));
//		g
		System.out.println(("(g) ")+ s1.indexOf('j'));
//		h
		System.out.println(("(h) ")+ s1.indexOf("to"));
//		i
		System.out.println(("(i) ")+ s1.lastIndexOf('a'));
//		j
		System.out.println(("(j) ")+ s1.lastIndexOf("o", 15));
//		k
		System.out.println(("(k) ")+ s1.length());
//		l
		System.out.println(("(l) ")+ s1.substring(5));
//		m
		System.out.println(("(m) ")+ s1.substring(5, 11));
//		n
		System.out.println(("(n) ")+ s1.contains(s2));
//		o
		System.out.println(("(o) ")+ s1.endsWith("Java"));
//		p
		System.out.println(("(p) ")+ s1.startsWith("Wel"));
	}

}

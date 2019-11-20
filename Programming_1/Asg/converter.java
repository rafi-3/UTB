package Asg;

import java.util.Scanner;

public class converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Number Conversion Systems. Choose bellow:\n");
				System.out.println("1. Decimal to Binary\n2. Decimal to Hexadecimal\n3. Binary to Decimal\n4. Hexadecimal to Decimal\n");
				int input = sc.nextInt();
				
				if(input == 1) {
					while(true) {
						try {
							System.out.println("Enter decimal:\n");
							int decimal = sc.nextInt();
							sc.nextLine();
							
							if(decimal < 0) {
								System.out.println("Error: negative number is not allowed!\n");
							} else if(decimal == 0) {
								break;
							} else {
								System.out.println("The binary is: " + convertBinary(decimal) + "\n");
							}
							
							
						} catch (Exception e) {
							System.out.println("Invalid decimal!\n");
							sc.nextLine();
						}
					}
				} else if(input == 2) {
					while(true) {
						try {
							System.out.println("Enter decimal:\n");
							int decimal = sc.nextInt();
							sc.nextLine();
							
							if(decimal < 0) {
								System.out.println("Error: negative number not allowed!\n");
							} else if(decimal == 0) {
								break;
							} else {
								System.out.println("The hexadecimal is: " + convertHex(decimal) + "\n");
							}
						} catch (Exception e) {
							System.out.println("Invalid decimal!\n");
							sc.nextLine();
						}
					}
				} else if(input == 3) {
					while(true) {
						try {
							System.out.println("Enter binary:\n");
							int binary = sc.nextInt();
							sc.nextLine();
							
							if(binary < 0) {
								System.out.println("Error: negative number not allowed!\n");
							} else if(binary == 0) {
								break;
							} else {
								String binaryStr = String.valueOf(binary);
								
								if(binaryStr.matches(".*[2-9].*")) {
									System.out.println("Invalid character detected!\n");
								} else {
									System.out.println("The binary to decimal value is " + binaryToDec(binaryStr) + "\n");
								}
							}
						} catch (Exception e) {
							System.out.println("Invalid character detected!\n");
							sc.nextLine();
						}
					}
				} else if(input == 4) {
					while(true) {
						System.out.println("Enter hexadecimal:\n");
						String hexadecimal = sc.next();
						
						int hexInt = Integer.parseInt(hexadecimal);
						
						if(hexInt < 0) {
							System.out.println("Error: negative number not allowed!\n");
						} else if(hexInt == 0) {
							if(hexadecimal.matches(".*[g-zG-Z].*")) {
								System.out.println("Invalid character detected!\n");
							} else if(hexadecimal.equals("0")) {
								break;
							} else {
								System.out.println("The hexadecimal to decimal value is " + hexaToDec(hexadecimal) + "\n");
							}
						}
					}
				} else {
					System.out.println("Invalid option!\n");
				}
			} catch (Exception e) {
				System.out.println("Invalid option!\n");
				sc.nextLine();
			}
		}
	}
	
	public static String convertBinary(int decimal) {

	     String result1 = ((decimal % 2 == 0) ? "0" : "1");

	     if (decimal == 0 || decimal == 1) {
	         return result1;
	     }

	     return convertBinary(decimal/2) + result1;
	 }
	
	public static String convertHex(int decimal) {
		StringBuilder builder =  new StringBuilder();
			
		if (decimal > 0) {
			
			String hexNumber = convertHex(decimal/16);
			String hexCode= "0123456789ABCDEF";
			int hexDigit = decimal % 16;
			builder.append(hexNumber + hexCode.charAt(hexDigit));
		}
		
		return builder.toString();
	}
	
	public static int binaryToDec(String binary) {
		int l = binary.length();
	    if (l == 0) 
	    return 0;
	    String a = binary.substring(0,1);
	    String b = binary.substring(1);
	    return (Integer.parseInt(a) * (int)Math.pow(2, l - 1) + binaryToDec(b));
	}
	
	public static int hexaToDec(String hexadecimal) {
		int decimal = 0;
		String hexCode = "0123456789ABCDEF";
		hexadecimal = hexadecimal.toUpperCase();
		int length = hexadecimal.length();
		if (length > 0) {
			char ch = hexadecimal.charAt(0);
			int digit = hexCode.indexOf(ch);
			String substring = hexadecimal.substring(1);
			decimal = digit * (int) Math.pow(16, length - 1) + hexaToDec(substring);
		}
		return decimal;
	}
}

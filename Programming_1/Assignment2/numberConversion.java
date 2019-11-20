package Assignment2;
//Group assignment for:
//Muhammad Rafiuddin Bin Ag Haji Abd Rahman(B20190093)
//Lutfil Hadi Bin Tajudin(B20190097)
import java.util.Scanner;

public class numberConversion {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			try {
				System.out.println("Number Conversion Systems. Choose bellow:\n");
				System.out.println("1. Decimal to Binary\n2. Decimal to Hexadecimal\n3. Binary to Decimal\n4. Hexadecimal to Decimal\n");
				int input = sc.nextInt();
				
				if(input == 1) {
					while(true) {
						try {
							System.out.println("Enter decimal(0 for main menu):\n");
							int decimal = sc.nextInt();
							sc.nextLine();
							
							if(decimal < 0) {
								System.out.println("Error: negative number not allowed!\n");
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
							System.out.println("Enter decimal(0 for main menu):\n");
							int decimal = sc.nextInt();
							sc.nextLine();
							
							if(decimal < 0) {
								System.out.println("Error: negative number not allowed!\n");
							} else if(decimal == 0) {
								break;
							} else {
								System.out.println("The binary is: " + convertHex(decimal) + "\n");
							}
						} catch (Exception e) {
							System.out.println("Invalid decimal!\n");
							sc.nextLine();
						}
					}
				} else if(input == 3) {
					while(true) {
						try {
							System.out.println("Enter binary(0 for main menu):\n");
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
						System.out.println("Enter hexadecimal(0 for main menu):\n");
						String hexadecimal = sc.next();
						
						if(hexadecimal.matches(".*[g-zG-Z].*")) {
							System.out.println("Invalid character detected!\n");
						} else if(hexadecimal.equals("0")) {
							break;
						} else {
							System.out.println("The hexadecimal to decimal value is " + hexaToDec(hexadecimal) + "\n");
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
	
	public static int convertBinary(int decimal) {
		if (decimal == 0) {
			return 0;
		}
		else 
			return(decimal % 2 + 10 * convertBinary(decimal/2));
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

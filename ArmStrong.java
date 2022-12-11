package New_technics;

import java.util.Scanner;

public class ArmStrong {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArmStrong obj = new ArmStrong();
		obj.length();

	}
	public void length() {
		
		int num,len=0;
		System.out.println("Enter the the number to check\nWeather it is an armStrong number or not....");
		System.out.print("Enter the number:");
		num = scan.nextInt();
		int t1 = num;
		while(t1 != 0) {
			len = len+1;
			t1 = t1/10;
		}
		System.out.println("Length of the digit:"+len);
		chance(len,num);
		
	}
	public void chance(int len,int num) {
		
		int t2 = num,rem,total=0;
		
		while(t2 != 0){
			int multi=1;
			rem = t2%10;
			for(int i=1;i<=len;i++) {
				multi = multi*rem;
			}
			total = total + multi;
			t2 = t2/10;
		}
		if (total==num) {
			System.out.println(num+" is an armStrong Number....");
		}
		else {
			System.out.println(num+" is not an armStrong Number....");
		}
		
	}

	
	
}

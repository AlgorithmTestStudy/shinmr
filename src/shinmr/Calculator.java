package shinmr;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
	     
			try {
				menu();
				int num = sc.nextInt();
				
				if(num == 5) {
					System.out.println("계산기를 종료합니다.");
					break;
				}
			
				
				System.out.println("첫번재 숫자를 입력하세요:");
				int num1 = sc.nextInt();
				System.out.println("두번 숫자를 입력하세요:");
				int num2 = sc.nextInt();
				
				
				
				
				switch(num) {
					
					case 1: plus(num1, num2);
							break;
					case 2: sub(num1, num2);
							break;
					case 3: mul(num1, num2);
							break;
					case 4: div(num1, num2);
							break;
					case 5: break;
					default: System.out.println("잘못된 입력 입니다.");
				}
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력해 주세요.");
				String s = sc.next();
				System.out.println("현재 입력한 값은 : "+s+"입니다.");
			}
			
			
			
			
			
			
			
			
			
			
			
		}

		
		
		
		
	}
	
    static void menu() {
    	    System.out.println("숫자를입력하세요:");
	        System.out.println("1.더하기");
	        System.out.println("2.빼기");
	        System.out.println("3.곱하기");
	        System.out.println("4.나누기");
	        System.out.println("5.나가기");
    }
	
	
    static void plus(int num1, int num2) {
    	
    	System.out.println(num1 + num2);
    	
    }
    static void sub(int num1, int num2) {
    	System.out.println(num1 - num2);
    	
    }
    static void mul(int num1, int num2)  {
    	System.out.println(num1 * num2);
    	
    }
    static void div(int num1, int num2)  {
    	if(num2==0) {
    		System.out.println("0으로 나눌 수 없습니다.");
    		return;
    	}
    	System.out.println(num1 / num2);
    	
    	
    }
    
    
	
	
	

}



package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		switchEx();
		String day;
		switchEx2("Fri");
	}

	private static void switchEx2(String day) {
		String message;
		
		switch(day) {
		case "Mon":
		case "Tue":
		case "Wed":
		case "Thu":
			message = "열공";
			break;
		case "Fri":
			message = "열공 후 불금";
			break;
		case "Sat":
		case "Sun":
			message = "주말";
			break;
		default:
			message = "?";
		}
		System.out.println(day + "에는 " + message);
		
	}
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("1.Java 2.C 3.C++ 4.Python");

		int code = scanner.nextInt();

		switch (code) {
		case 1: // if(code ==1)
			System.out.println("R101");
			break;
		case 2: // if(code==2)
			System.out.println("R202");
			break;
		case 3: //if(code==3)
			System.out.println("R303");
			break;
		case 4: //if(code==4)
			System.out.println("R404");
			break;
		default:
			System.out.println("상담사에게 문의하세요.");
			break;
		}
		scanner.close();
		
	}

	private static void ifElseEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("1.Java 2.C 3.C++ 4.Python");

		int code = scanner.nextInt();

		if (code == 1) {
			System.out.println("R101");
		} else if (code == 2) {
			System.out.println("R202");
		} else if (code == 3) {
			System.out.println("R303");
		} else if (code == 4) {
			System.out.println("R404");
		} else {
			System.out.println("나머지는 상담원에게 문의하세요.");
		}

		scanner.close();
	}

	// if문 연습
	private static void ifElseEx() {
		Scanner scanner = new Scanner(System.in);

		// if ~ else if ~ else
		System.out.print("정수 입력: ");
		int num = scanner.nextInt();
//		
//		if(num > 0) {
//			System.out.println(num + "는 양수입니다.");
//		} else if( num < 0 ) {
//			System.out.println(num + "는 음수입니다.");
//		}else {
//			System.out.println(num + "는 0입니다.");
//		}

		// 중첩 if
		if (num == 0) {
			System.out.println(num + "는 0입니다.");
		} else {
			if (num > 0) {
				System.out.println(num + "는 양수입니다.");
			} else {
				System.out.println(num + "는 음수입니다.");
			}
		}
		scanner.close();
	}
}

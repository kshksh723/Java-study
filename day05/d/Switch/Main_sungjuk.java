package my.day05.d.Switch;

import java.util.Scanner;

public class Main_sungjuk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Sungjuk sj = new Sungjuk(); // 기본생성자
		
		
		
		System.out.println("1. 학번 : ");
		sj.hakbun = sc.nextLine();// "0991234"
		
		System.out.println("2. 성명 : ");
		sj.name = sc.nextLine(); // "이순신"
			String input_str = "";
		
			
			
				int status = 0; // 밖으로 빼내야함, //점수를 입력해주는 상태 : 1
				// 나이를 입력해주는 상태 : 
		try {
		
			// int status = 0; // 좌중괄호, 우중괄호만 쓰인다
			// 벗어난 순간 예외를 못씀
			
		System.out.println("3. 국어 : ");
		
		
		// === ** 유효성 검사하기 (올바른 데이터인지 틀린 데이터인지 검사하는 것) ***
		input_str = sc.nextLine(); // 내가 키보드라 입력한 값을 받는 것
		byte kor = Byte.parseByte(input_str); // 90
												// 101
												// 2343242
												// 똘똘이
		
		if( !sj.check_jumsu(kor)) {
			sc.close();
			return;// return 을 만나면 해당 메소드가 종료가 된다
		}
		else {
			sj.kor = kor;
		}
			
		// 거짓이 되어야지만 참이 될 수 있다 (not) -> 이 자체가 false라면	
		// sj.check_jumsu(kor);12
		
		// sj.kor = 
		
		System.out.println("4. 영어 : ");
		input_str = sc.nextLine();
		byte eng = Byte.parseByte(input_str); // 100
												// -20	
												// 3943242
												// "호호하하"
		if( !sj.check_jumsu(eng)) {
			sc.close();
			return;// return 을 만나면 해당 메소드가 종료가 된다
		}
		else {
			sj.eng = eng;
		}
		
		System.out.println("5. 수학 : ");
		input_str = sc.nextLine();
		byte math = Byte.parseByte(input_str);  // 80
												// 120	
												// -7843242
												// "헤헤헤" -> byte라고 못함
		
			if( !sj.check_jumsu(math)) {
			sc.close();
			return;// return 을 만나면 해당 메소드가 종료가 된다
			}
			else {
			sj.math = math;
			}
			
			
			
			
			
			
	
			
			
		
			
	
		} catch (NumberFormatException e) {
			// e.printStackTrace();
			//System.out.println(e.getMessage());

			
			System.out.println(">> 입력하신" + input_str +  "는 올바른 데이터가 아닙니다.<< \n" );
			if(status == 1) { //점수를 입력해주는 상태이라면
				System.out.println(">> 입력하신" + input_str +  "는 올바른 데이터가 아닙니다.<< \n" 
									+"[점수에 대한 경고] 점수는 0~100까지의 정수만 입력하세요!!");
		}
		/*
		 * else {//나이를 입력해주는 상태이라면 System.out.println(">> 입력하신" + input_str +
		 * "는 올바른 데이터가 아닙니다.<< \n" +"[나이에 대한 경고] 점수는 20~50까지의 정수만 입력하세요!!"); }
		 */
		}

		System.out.println();
		//input_str : 지역변수
		sj.sungjuk_print();

	sc.close();
	
		
		// byte 범위에 들어와야 함 -> 0인지 100이하인지 알 수 있다
		
		
	}
	}



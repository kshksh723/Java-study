package my.day01;

// import java.lang.*; // *의 듯은 모든 것을 의미한다.
// 즉, java.lang 패키지 속에 있는 모든 클래스들을 사용하겠다는 말이다.
// 기본적으로 import java.lang.*; 생략되어져 있다.

public class Member {

	/* 만약에 쇼핑몰 프로그램을 작성하고자 한다라면
	 회원, 제품, 장바구니, 주문내역 등등 부품이 필요할 것이다.
	 여기서 필요로 하는 부품의 설계도면을 "클래스"라고 보면 된다
	 
	  */
	
	// 추상화 ==> 필요한 속성 및 기능만 뽑아 내는 것을 말한다.
	// 회원가입(병원) ==> 신장, 몸무게, 혈액형, 혈압
	// 회원가입(쇼핑몰) ==> 아이디, 비밀번호, 성명, 이메일, 전화번호, 주소 
	// attribute == property == field == 속성
	/*
	 * 1). instance(인스턴스)변수 -- instance(인스턴스)변수를 다른말로 non static 변수라고도 한다. --
	 * instance(인스턴스)는 클래스가 메모리(RAM)에 올라가서 실제 사용가능한 객체로 되어진 상태를 말하는 것이다. --
	 * instance(인스턴스)변수는 서로 다른 instance 끼리 공유하지 못하고 각자 자기의 instance 내에서만 사용하는 것이다.
	 */
	String id;  //String은 문자열을 뜻하는 클래스이다.
				// id 라는 변수(변하는 수)에는 문자열이 들어온다 뜻이다.
	
	String pwd; // 비밀번호
	String name; // 성명
	String email; // 이메일
	
	// id, pwd, name, email 은 instance(인스턴스)변수라고 부른다.
	
	/* 2). static(스태틱)변수
	 -- static(스태틱)변수는 동일한 클래스로 생성되어진 서로 다른 instance끼리 공유되어진다
	  
	  */
	
	 ///////////////////////////
    // >>> 생성자(constructor) <<< //
    Member() { // 생성자임
    	System.out.println(">>> Member 클래스의 생성자 호출함 <<< \n");
    }
   
	
	// 회원의 정보를 출력해주는 기능을 만들어 보겠습니다.
    void print_info() { // 인스턴스 method(메소드)이다.
  	  // void는 return 값이 없다라는 타입이다.
  	  
  	  System.out.println("=== 회원정보 === \n" 
  			  				+ " 1. 아이디 :" + id + "\n"
  	  						+ "2. 비밀번호 :" + pwd + "\n" 
  	  						+ "3. 성명 : " + name + "\n"
  	  						+ "4. 이메일 :" + email + "\n"
  	  						+ "5. 주소 :" + address + "\n");
  			  
  	  						// \n은 줄바꿈을 말한다
  	  						//  문자열 사이의 +는 문자열 결합을 뜻한다
  	  
  	  
  	  
    }
	/*
    behavior == 행위 == 기능 == method(메소드)
    자바에서 소괄호 () 가 나오는 것은 오로지 딱 2개 밖에 없다. 
    첫번째는 생성자(constructor)에서 소괄호 ()가 사용되고, 
    두번째는 method(메소드)에서 소괄호 ()가 사용된다.    
 암기 해야함*/
    
   
	
	static String address; // 
	
	
}

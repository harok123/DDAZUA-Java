package day22;
//	★★★★★★★ 중요!! 꾸준히 보고 익혀야 됨

//  VO(Value Object) 클래스 : 처리할 데이터 한 건과 데이터를 처리하는 메소드를 기억하는 클래스, DTO(Data Transfer Object)
//  Bean : 데이터를 저장할 멤버 변수(필드)와 멤버 변수에 데이터를 입출력할 수 있는 getter & setter 메소드로만 구성된 클래스를 말한다. 
public class MemberVO {

//	멤버 변수(필드)를 선언한다.
//	멤버 변수를 선언하고 초기화 시키지 않으면 숫자는 0, 문자는 공백, boolean은 false, 클래스로 만든 모든 멤버는 null로 자동초기화 된다.
//	멤버 변수에 저장된 데이터를 클래스 외부에서 함부로 수정할 수 없도록 일반적으로 멤버 변수의 접근 권한은 private로 지정한다.
//	데이터만 정확하다면 언제 어디서 메소드를 실행하더라도 같은 결과를 얻을 수 있으므로 일반적으로 메소드의 접근 권한은 public으로 지정한다. 
	
//	[접근 권한 지정자] [static] 자료형 변수명 [= 초기치];
//	멤버 변수↓
	private int no1;						// 0으로 자동 초기화
	private String name1;			// null
	private boolean gender1;		// false		
	private double height1;			// 0.0
	private char Firstname1;		// 공백
	
	public int no;					
	public String name;			
	public boolean gender;		
	public double height;
	public char Firstname;
	
//	접근 권한 지정자
//	private : 현재 클래스 외부에서 접근할 수 없다. 상속은 가능하지만 접근 할 수 없다.
//	protect : 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 접근할 수 있다. 상속 가능
//	package : 기본값(접근 권한 생략시), 현재 패키지에서는 public처럼 사용하고 다른 패키지에서는 private처럼 사용된다.
//	public : 현재 클래스 외부에서 자유롭게 접근이 가능하다.
	
//	정적(static) 변수
//	최초에 한 번만 생성되고 초기화 되는 변수로 현재 클래스로 생성한 모든 객체에서 공유해서 사용한다.
//	변수를 사용하기 위해 클래스의 객체를 선언할 필요 없이 클래스 이름에 "."을 찍어서 바로 접근이 가능하다.
	
}

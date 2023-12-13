package ex04;

public class Main {
	public static void main(String[] args) {
		// service 객체 생성 
		UserService service = new UserService();
		// user 객체 생성 및 초기화 
		UserVO user = new UserVO("abc111", "111", "홍길동", 22);
		
		// checkId 메소드로 유저 아이디 중복 검사 
		if (service.checkId(user.getId())) {
			// 중복 되지 않았다면 join 메소드 호출하여 유저 회원가입 
			service.join(user);
			// 유저 정보 출력 
			System.out.println(user.toString());
			// 가입 완료 메시지 출력 
			System.out.println("가입이 완료되었습니다.");
		} else {
			// 아이디 중복시 메시지 출력 
			System.out.println("중복된 아이디가 존재합니다.");
		}
		
		// 로그인 메소드 호출하여 아이디, 비밀번호 일치 여부 검증 하고 login 에서 리턴 받는 객체를 user에 다시 저장 
		user = service.login("abc111", "111") ;
		
		//로그인 메소드 실행결과 리턴 받은 객체가 null일 경우 로그인 실패, 아 경우 환영 메시지 출력 
		if(user != null) {
			System.out.println(user.getName() + "님 환영합니다.");
		}else {
			System.out.println("로그인에 실패하였습니다.");
		}
	}
}


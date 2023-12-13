package ex04;

import java.util.ArrayList;
import java.util.List;

public class UserService {
//	회원정보를 저장할 List를 private으로 선언한다.
	private List<UserVO> userInfo = new ArrayList<>();
	
//	아이디 중복검사 메소드 정의 
	Boolean checkId(String id) {
		for(UserVO user : userInfo) {
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	
//	회원가입 메소드 정의
	void join(UserVO user) {
		userInfo.add(user);
	}
	
//	로그인 메소드 정의
	UserVO login(String id, String pw) {
		for(UserVO user : userInfo) {
			if(user.getId().equals(id) && user.getPassword().equals(pw)) {
				return user;
			}
		}
		return null;
	}

}

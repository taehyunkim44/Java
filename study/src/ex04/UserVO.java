package ex04;

public class UserVO {
//	필드
//	아이디(String타입), 비밀번호(String타입), 이름(String타입), 나이(int타입)
	private String id;
	private String password;
	private String name;
	private int age;
	
//	모든 필드는 private으로 선언하고 생성자를 통해서만 초기화한다
	public UserVO(String id, String password, String name, int age) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	
//	메소드
//	toString()을 재정의하여 모든 필드의 값을 확인할 수 있도록 한다. 
	@Override
	public String toString() {
		return "아이디 : " + id + ", 비밀번호 : " + password + " ,이름 : " + name + " ,나이 : " + age;
	}


//	모든 필드의 getter메소드를 만든다. 
	public String getId() {
		return id;
	}


	public String getPassword() {
		return password;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}
	

}

package chap10_polymorphism.member;


// 명시되어 있지 않지만 모든 클래스는 Object 클래스를 상속받아 만들어진다.
public class Member {
	private long id;
	private String userid;
	private String pasword;
	private String userEmail;
	private String userNickname;
	
	public Member(long id, String userid, String pasword, String userEmail, String userNickname) {
		super();
		this.id = id;
		this.userid = userid;
		this.pasword = pasword;
		this.userEmail = userEmail;
		this.userNickname = userNickname;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	
	// Object 클래스의 toString 메소드를 오버라이드한 메소드
	// 필드값을 확인할 수 있는
	@Override
	public String toString() {
		return "Member [id=" + id + ", userid=" + userid + ", pasword=" + pasword + ", userEmail=" + userEmail
				+ ", userNickname=" + userNickname + "]";
	}
	
	


	
	
	
	
	

}

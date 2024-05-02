package _240501_homework;

// DTO: Data Transfer Object, VO: Value Object, Entity
public class User {
	// private로 하는이유는 직접 바꾸지 못하게 하기위해서
	// 보안성 Up
	// 그래서 setter로 받아주고 getter로 보내주는.
	private long id;
	private String username;
	private String password;
	
	public User()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	

}

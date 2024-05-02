package chap99_homework.homework03;

public class UserBook {
	User[] users = new User[100];
	
	int index = 0;
	
	public void saveUserInfo(String username, String password) {
		User user = new User();
		
		user.setId(index + 1);
		user.setUsername(username);
		user.setPassword(password);
		
		users[index++] = user;
	}
}

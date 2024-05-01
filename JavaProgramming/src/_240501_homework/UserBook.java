package _240501_homework.basic;

public class UserBook {
	User[] arr = new User[100];
	int index = 0;
	
	public void saveUserInfo(String username, String password)
	{
		User u = new User();
		
		u.setId(index+1);
		u.setPassword(password);
		u.setUsername(username);
		
		arr[index] = u;
	}
	
	

}

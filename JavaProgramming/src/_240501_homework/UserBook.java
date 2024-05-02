package _240501_homework;

public class UserBook {
	User[] arr = new User[100];
	
	int index = 0;
	
	public void saveUserInfo(String username, String password)
	{
		User u = new User();//User타입의 User객체생성 
		
		u.setId(index + 1);
		u.setPassword(password);
		u.setUsername(username);
		
		arr[index++] = u;
	}
	
	public void printUserInfo(int index)
	{
		if(arr[index] != null)
		{
			System.out.println("id: " + arr[index].getId()
					+ ", username: " + arr[index].getUsername()
					+ ", pasword: "+ arr[index].getPassword());
			
		}
		else {
			System.out.println("해당 인덱스에 저장된 데이터가 없습니다.");
		}
	}

}

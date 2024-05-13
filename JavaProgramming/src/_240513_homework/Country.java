package _240513_homework;

public enum Country {
//	7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고
//	첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다.
//	country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요.
	
//	country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요.
//	(각 국의 음식은 한국=불고기, 중국=짜장면(마라탕), 일본=초밥, 미국=햄버거)
	
	
	KOR("한국","불고기"),
	CHI("중국","마라탕"),
	JAP("일본","초밥"),
	USA("미국","햄버거");
	
	private String countryStr;

	public String getCountryStr() {
		return countryStr;
	}

	public void setCountryStr(String countryStr) {
		this.countryStr = countryStr;
	}

	public void notifyFood(String country)
	{
		
	}
	

}

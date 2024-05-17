package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap23_stream.card.CreditCard;

public class _04_PipeLIne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<CreditCard> 생성
		 * 
		 * 카카오, 라이언카드, 1000
		 * 삼성카드, 탭탭오, 2000
		 * 신한카드, 드림카드, 3000
		 * 삼성카드, ID카드, 5000
		 * 현대카드, 더블랙, 10000
		 * 아멕스, 블랙카드, 100000
		 * 
		 * */
		// 1. 스트림 파이프라인을 통해서 최대한도가 5000이상인 카드정보를 출력
		// (최종처리로 forEach 사용,cardInfo 메소드 호출)
		
		// 1) 컬렉션 만들기
		List<CreditCard> creditCardList = new ArrayList<>();
		
		// 2) 객체 만들기
		creditCardList.add(new CreditCard("카카오", "라이언카드", 1000));
		creditCardList.add(new CreditCard("삼성카드", "탭탭오", 2000));
		creditCardList.add(new CreditCard("신한카드", "드림카드", 3000));
		creditCardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		creditCardList.add(new CreditCard("현대카드", "더블랙", 10000));
		creditCardList.add(new CreditCard("아멕스", "블랙카드", 100000));
		
		// 파이프라인 없이 스트림처리
		// creditCardList를 Stream으로 변환 -> List<CreditCard> -> Stream<CredirCard>
		// 3) 스트림을 이용해서 creditrCardList에 있는 최대한도가 5000이상이 모여있는 리스트 새로 만들기
		Stream<CreditCard> creditCardStream = creditCardList.stream();
		
		// 4) 중간처리
		// 한도가 5천이상인 CreditCard만 모아서 새로운 Stream 생성
		//기본형(int 같은)은 따로 equal함수가 x 그래서 true나 false값으로 나오면되니까 수를 비교하는 거로 해본다.
		Stream<CreditCard> overFiveCardStream = creditCardStream.filter(
				cardLimit -> cardLimit.getLimit() >= 5000); 
		
		
		// 5) 최종처리 
		// forEach로 출력(리턴값이 없으니까 .....)
		overFiveCardStream.forEach(cardLimit -> cardLimit.cardInfo());
		
		// 1-2. 파이프라인으로 구성
		creditCardList.stream() //Stram<CreditCard>
					   // 최대 한도가 5천 이상인 CreditCard 객체만 모은 Stream<CreditCard>
				       .filter(card -> card.getLimit() >= 5000)
				       //최동단계 메소드
				       // forEach 출력
				       .forEach(cardLimit -> cardLimit.cardInfo());
	}

}

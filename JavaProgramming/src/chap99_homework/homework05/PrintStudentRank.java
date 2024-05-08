package chap99_homework.homework05;

public class PrintStudentRank {
	// 학과별 배열을 만들어주는 메소드
	public void makMajorArr(Student[] stArr, int index) {
		//과별 학생수 새는 정수들
		//학과별 배열을 학생수만큼만 생성하기 위해서
		int mathCnt = 0;
		int engCnt = 0;
		int comCnt = 0;
		
		for(int i = 0; i < index; i++) {
			if(stArr[i] != null) {
				if(stArr[i].getClass().getSimpleName().equals("MathStudent")) {
					mathCnt++;
				} else if(stArr[i].getClass().getSimpleName().equals("EngStudent")) {
					engCnt++;
				} else if(stArr[i].getClass().getSimpleName().equals("ComStudent")) {
					comCnt++;
				}
			}
		}
		
		//학과별 학생 배열
		MathStudent[] mstArr = {};
		EngStudent[] engArr = {};
		ComStudent[] comArr = {};
		
		//학생수가 1명이라도 있을 때만 동작
		if(mathCnt != 0) {
			mstArr = new MathStudent[mathCnt];
			
			int idx = 0;
			
			for(int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) {
					if(stArr[i].getClass().getSimpleName().equals("MathStudent")) {
						mstArr[idx] = new MathStudent(stArr[i].getSno(),
												stArr[i].getName());
										//(MathStudent)stArr[i];
						mstArr[idx].subject = stArr[i].getSubject();
						mstArr[idx++].finalExam = stArr[i].getScore();
					}
				}
			}
		}
		
		if(engCnt != 0) {
			engArr = new EngStudent[engCnt];
			
			int idx = 0;
			
			for(int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) {
					if(stArr[i].getClass().getSimpleName().equals("EngStudent")) {
						engArr[idx] = new EngStudent(stArr[i].getSno(),
								stArr[i].getName());
						engArr[idx].subject = stArr[i].getSubject();
						engArr[idx++].finalExam = stArr[i].getScore();
					}
				}
			}
		}
		
		if(comCnt != 0) {
			comArr = new ComStudent[comCnt];
			
			int idx = 0;
			
			for(int i = 0; i < stArr.length; i++) {
				if(stArr[i] != null) {
					if(stArr[i].getClass().getSimpleName().equals("ComStudent")) {
						comArr[idx] = new ComStudent(stArr[i].getSno(),
								stArr[i].getName());
						comArr[idx].subject = stArr[i].getSubject();
						comArr[idx++].finalExam = stArr[i].getScore();
					}
				}
			}
		}
		
		//학과별 학생 배열을 성적순위대로 정렬하고 출력하는 메소드
		printRankArray(mstArr, engArr, comArr);
	}
	
	// 학과별 배열을 성적순대로 정렬하고 출력하는 메소드
	public void majorRank(Student[] stArr, String major) {
		if(stArr.length != 0) {
			//성적 순위대로 정렬
			//성적이 높은 사람이 앞으로 성적이 낮은 사람이 뒤로
			for(int i = 0; i < stArr.length; i++) {
				for(int j = 0; j < i; j++) {
					if(i > 0 && stArr[i].getAvg() > stArr[j].getAvg()) {
						if(major.equals("수학")) {
							MathStudent temp = (MathStudent) stArr[i];
							stArr[i] = stArr[j];
							stArr[j] = temp;
						} else if(major.equals("영어")) {
							EngStudent temp = (EngStudent) stArr[i];
							stArr[i] = stArr[j];
							stArr[j] = temp;
						} else if(major.equals("컴공")) {
							ComStudent temp = (ComStudent) stArr[i];
							stArr[i] = stArr[j];
							stArr[j] = temp;
						}
					}
				}
			}
			
			//성적순위대로 학생정보 출력
			for(int k = 0; k < stArr.length; k++) {
				System.out.println("------" + major + "과 성적순위------");
				System.out.println("순위 : " + (k + 1));
				stArr[k].printInfo();
			}
		}
	}
	
	// 학과별 배열을 모두 받아서 majorRank로 전달하는 메소드
	public void printRankArray(MathStudent[] mathStudentArr, EngStudent[] engStudentArr,
			ComStudent[] comStudentArr) {
		majorRank(mathStudentArr, "수학");
		majorRank(engStudentArr, "영어");
		majorRank(comStudentArr, "컴공");
	}
}

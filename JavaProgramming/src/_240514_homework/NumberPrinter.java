package _240514_homework;

public class NumberPrinter {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void numPrint1(int num) {
        this.setNum(num);

        for (int i = this.num; i <= 50; i++) {
            if (i > 0) {
                if (i % 3 == 0) {
                    System.out.println("첫 번째 스레드 - " + i);
                    
                    notify();
                    try {
                        wait();
//                        Thread.sleep(10);
                    } catch (InterruptedException ie) {
                        System.out.println(ie.getMessage());
                    }
                }
            }
            
        }
    }
//두번째가 끝나면 첫번째를 못깨우는거라
    public synchronized void numPrint2(int num) {
        this.setNum(num);

        for (int i = this.num; i <= 100; i++) {
            if (i > 0) {
                if (i % 35 == 0) {
                    System.out.println("두 번째 스레드 - " + i);
                    //Thread.yield();
                    notify();
                    try {
                        wait();
//                        Thread.sleep(10);
                    } catch (InterruptedException ie) {
                        System.out.println(ie.getMessage());
                    }
                }
            }          
            
        }
    }
}

//package _240514_homework;
//
//public class NumberPrinter {
//	private int num;
//	
//	public void setNum(int num) {
//		this.num = num;
//	}
//	
//	public synchronized void numPrint1(int num) {
//		this.setNum(num);
//		
//		for(int i = this.num; i <= 50; i++) {
//			if(i > 0) {
//				if(i % 3 == 0) {
//					System.out.println("첫 번째 스레드 - " + i);
//				}
//			}
//			notify();
//			try {
//				wait();
//				Thread.sleep(10);
//			}
//			catch(InterruptedException ie) {
//				System.out.println(ie.getMessage());
//			}
//		}
//		
//	}
//	
//	public synchronized void numPrint2(int num) {
//		this.setNum(num);
//		
//		
//		for(int i = this.num; i <= 100; i++) {
//			if(i > 0) {
//				if(i % 35 == 0) {
//					System.out.println("두 번째 스레드 - " + i);
//				}
//				
//			}
//		
//		notify();
//		try {
//			wait();
//			Thread.sleep(10);	
//		}
//		catch(InterruptedException ie) {
//			System.out.println(ie.getMessage());
//		}
//	}
//	}
//}	



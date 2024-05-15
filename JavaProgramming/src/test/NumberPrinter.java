package test;

public class NumberPrinter {
    private int num;
    private boolean isFirstPrinted = false;

    public synchronized void numPrint1(int num) {
        this.num = num;

        for (int i = num; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("첫 번째 스레드 - " + i);
            }
            isFirstPrinted = true;
            notify(); // 두 번째 스레드를 깨움
            try {
                if (i < 50) {
                    wait(); // 첫 번째 스레드를 일시정지
                }
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }

    public synchronized void numPrint2(int num) {
        try {
            while (!isFirstPrinted) {
                wait(); // 첫 번째 스레드의 작업을 기다림
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.num = num;

        for (int i = num; i <= 100; i++) {
            if (i % 35 == 0) {
                System.out.println("두 번째 스레드 - " + i);
            }
            isFirstPrinted = false;
            notify(); // 첫 번째 스레드를 깨움
            try {
                if (i < 100) {
                    wait(); // 두 번째 스레드를 일시정지
                }
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }
}

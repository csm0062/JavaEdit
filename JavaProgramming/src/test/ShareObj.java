package test;

public class ShareObj {

    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        PrintNum1 pn01 = new PrintNum1();
        PrintNum2 pn02 = new PrintNum2();

        pn01.setNp(np);
        pn02.setNp(np);

        pn01.start();
        pn02.start();
    }
}


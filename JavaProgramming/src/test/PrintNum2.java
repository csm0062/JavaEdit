package test;

public class PrintNum2 extends Thread {
    private NumberPrinter np;

    public NumberPrinter getNp() {
        return np;
    }

    public void setNp(NumberPrinter np) {
        this.np = np;
    }

    @Override
    public void run() {
        np.numPrint2(1);
    }
}
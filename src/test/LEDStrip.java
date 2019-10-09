package test;

public class LEDStrip {
    private LED[] ledStrip;


    public LEDStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }

    private int lengthofString() {
        return ledStrip.length;
    }

    private int numberofdefectiveLEDs() {
        int counter = 0;
        for (LED led : ledStrip) {
            if (led.isWorking() == false) {
                counter++;
            }

        }
        return counter;
    }

    private boolean isStripDefective() {
        return (numberofdefectiveLEDs() > (lengthofString() / 2));
    }

    public void printStripstatus() {
        System.out.println(isStripDefective() ? "This strip is defective" : "This strip is not defective");
    }

    public LED[] getLedStrip() {
        return ledStrip;
    }

    public void setLedStrip(LED[] ledStrip) {
        this.ledStrip = ledStrip;
    }
}

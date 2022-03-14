public class Printer {

    private int stock;
    private int pages;
    private int copies;
    private int toPrint;
    private int toner;

    public Printer(int stock, int pages, int copies, int toPrint, int toner) {
        this.stock = stock;
        this.pages = pages;
        this.copies = copies;
        this.toPrint = toPrint;
        this.toner = toner;
    }

    public int hasPaper() {
        return this.stock;
    }

    public int print() {
        this.toPrint = (this.pages * this.copies);
        if (this.toPrint <= this.stock) {
            this.stock -= this.toPrint;
            this.toner -= this.toPrint;
            return this.stock;
        } else {
            return this.stock;
        }
    }

    public int checkToner() {
        return this.toner;
    }
}

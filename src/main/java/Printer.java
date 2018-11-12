public class Printer {

    private int remainingPaper;
    private int toner;

//    the constructor for printer objects
    public Printer(int remainingPaper, int toner){
        this.remainingPaper = remainingPaper;
        this.toner = toner;
    }

    public int print(int pages, int copies) {
        int totalPages = pages * copies;
        if (this.remainingPaper >= totalPages) {
            this.remainingPaper -= totalPages;
            this.toner -= totalPages;
        }
        return this.remainingPaper;
    }

    public int refill(int addedPages) {
        return this.remainingPaper + addedPages;
    }

    public int getToner() {
        return this.toner;
    }
}

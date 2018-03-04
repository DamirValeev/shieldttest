package lesson3March3;

import static java.lang.System.out;

public class Book {
    String nameBook;
    int pageBook;
    double priceBook;
    int yearMakeBook;
    int dayAgoBook;

    Book(String nameBook, int pageBook, double priceBook, int yearMake) {
        this.nameBook = nameBook;
        this.pageBook = pageBook;
        this.priceBook = priceBook;
        this.yearMakeBook = yearMake;
    }

    double priceOnePage() {
        out.println((double)priceBook/pageBook);
        return (double)priceBook/pageBook;
    }

    int oneYearAgo() {
        yearMakeBook++;
        dayAgoBook+=365;
        return dayAgoBook;
    }

    void giveInfoBook() {
        out.println(nameBook + " " + pageBook
         + " " + priceBook + " " + yearMakeBook + " " +
        dayAgoBook);
    }

}

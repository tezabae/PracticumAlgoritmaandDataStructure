package midtermexam;

public class Loan {
    Student std;
    Book book;
    int loanDuration;
    int loanLimit = 5;
    int fine;
    int late;

    public Loan(Student std, Book book, int loanDuration) {
        this.std = std;
        this.book = book;
        this.loanDuration = loanDuration;
        calculateFine();
    }

    public void calculateFine() {
        if (loanDuration > loanLimit) {
            late = loanDuration - loanLimit;
            fine = late * 2000;
        } else {
            late = 0;
            fine = 0;
        }
    }

    public void showLoan() {
        System.out.println("Student: " + std.name + " (" + std.id + "), Book: " + book.title +
                ", Duration: " + loanDuration + " days, Late: " + late + " days, Fine: Rp " + fine);
    }
}


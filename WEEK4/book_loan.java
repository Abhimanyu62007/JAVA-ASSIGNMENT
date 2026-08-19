public class book_loan {
    String bookName;
    String borrowerName;
    int loanDays;

    book_loan(String bookName, String borrowerName, int loanDays) {
        this.bookName = bookName;
        this.borrowerName = borrowerName;
        this.loanDays = loanDays;
    }

    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Borrower Name: " + borrowerName);
        System.out.println("Loan Days: " + loanDays);
    }

    public static void main(String[] args) {
        book_loan loan = new book_loan("Java Programming", "Abhimanyu", 14);
        loan.display();
    }
}

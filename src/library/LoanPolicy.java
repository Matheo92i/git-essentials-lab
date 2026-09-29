package library;

public class LoanPolicy {
<<<<<<< HEAD
    public int maxBooksAllowed(Role role) {
        if (role == Role.STUDENT) {
            return 3;
        }
        if (role == Role.FACULTY) {
            return 5;
        }
        return 2;
    }
>>>>>>> lab-v1/ex04/faculty
    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}

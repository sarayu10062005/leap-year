public class Leap {
    public static void main(String[] args) {
        int year = 2025;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}

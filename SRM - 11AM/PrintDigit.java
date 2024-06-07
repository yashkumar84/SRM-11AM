public class PrintDigit {
    static void printDigit(int num) {
        if (num == 0)
            return;
        printDigit(num - 1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        printDigit(5);
    }

}

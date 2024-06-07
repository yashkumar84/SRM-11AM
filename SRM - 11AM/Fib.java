public class Fib {
    static int fib(int num) {
        if (num < 2) {
            return num;
        }

        int first = fib(num - 1);
        int second = fib(num - 2);
        return first + second;  
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

}

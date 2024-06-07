public class Fact {
    static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        int res = fact(num - 1);
        return res * num;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}

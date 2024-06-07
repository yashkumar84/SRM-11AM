public class TreeRecursion {
    static void tree(int num) {
        if (num < 1)
            return;

        System.out.println(num + "Pre call");
        tree(num - 1);
        System.out.println(num + "Mid Call");
        tree(num - 2);
        System.out.println(num + "Post Call");
    }

    public static void main(String[] args) {
        tree(3);
    }

}

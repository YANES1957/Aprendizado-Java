public class For3 {
    public static void main(String[] args) {
        for (var a = 2; a <= 100; a++) {
            if (a %2 !=0)
                System.out.println(a);
            continue;
        }
    }
}
public class DoWhileFor {
    public static void main(String[] args) {
        for (int i = 0; i <= args.length; i++) {
            System.out.println(args[i]);
            i++;

            i = 0;
            do {

                System.out.println(args[i]);
                i++;
                System.out.println("*************************************************");


            } while (args.length > 1);
            System.out.println(args[i]);
        }
    }
}


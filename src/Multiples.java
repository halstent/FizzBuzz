public class Multiples {


    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i <= 1000; i++) {

            boolean multiple_3 = i % 3 == 0;
            boolean multiple_5 = i % 5 == 0;

            if (multiple_3 || multiple_5) {
                count += 1;
            }}

        System.out.println(count);

    }

}
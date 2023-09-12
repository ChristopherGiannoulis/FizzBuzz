public class Reduce {
    public static void main(String[] args) {
        int hund = 100;
        int count = 0;
        while (hund != 0) {
            ;
            boolean even = hund % 2 == 0;
            if (even) {
                hund = hund / 2;
            }
            else {
                hund = hund - 1;
            }
            count = count + 1;
        }
        System.out.println(count);
            }
        }


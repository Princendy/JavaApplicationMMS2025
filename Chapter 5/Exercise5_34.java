public class Exercise5_34 {

    public static void main(String[] args) {

        System.out.println("Decimal Binary Octal Hex");

        for (int i = 1; i <= 256; i++) {

            System.out.printf("%d %s %o %x%n",
                    i,
                    Integer.toBinaryString(i),
                    i,
                    i);
        }
    }
}
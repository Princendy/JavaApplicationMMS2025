import java.security.SecureRandom;

public class Exercise5_36 {

    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        correctResponse();   // call the method so it runs
    }

    public static void correctResponse() {

        int response = random.nextInt(4) + 1;

        switch(response) {
            case 1: System.out.println("Very good!"); break;
            case 2: System.out.println("Excellent!"); break;
            case 3: System.out.println("Nice work!"); break;
            case 4: System.out.println("Keep up the good work!"); break;
        }
    }
}
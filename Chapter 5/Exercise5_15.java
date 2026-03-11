public class Exercise5_15 {

    public static double hypotenuse(double side1, double side2)
    {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args)
    {
        System.out.println("Triangle\tSide1\tSide2\tHypotenuse");

        System.out.printf("1\t%.1f\t%.1f\t%.1f%n",
                3.0, 4.0, hypotenuse(3.0, 4.0));

        System.out.printf("2\t%.1f\t%.1f\t%.1f%n",
                5.0, 12.0, hypotenuse(5.0, 12.0));

        System.out.printf("3\t%.1f\t%.1f\t%.1f%n",
                8.0, 15.0, hypotenuse(8.0, 15.0));
    }
}
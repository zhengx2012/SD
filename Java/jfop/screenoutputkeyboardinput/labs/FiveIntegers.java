public class FiveIntegers {
  public static void main(String[] args) {
    java.util.Scanner keyword = new java.util.Scanner(System.in);


    System.out.println("Please enter a list of 5 integers, first one: ");
    int a = keyword.nextInt();

    System.out.println("Second intger: ");
    int b = keyword.nextInt();

    System.out.println("Third intger: ");
    int c = keyword.nextInt();

    System.out.println("Fourth integer: ");
    int d = keyword.nextInt();

    System.out.println("Fifth integer: ");
    int e = keyword.nextInt();

    System.out.println(a+ " " +b+ " " +c+ " " +d + " "  + e);
    System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);
    System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
  }
}

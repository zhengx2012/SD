public class MyName {
  public static void main(String[] args) {
    firstName();
    space();
    lastName();
    System.out.println();
    fullName();
  }
  public static void firstName() {
    System.out.print("Xian");
  }
  public static void lastName() {
    System.out.println("Zheng");
  }
  public static void space() {
    System.out.print(" ");
  }
  public static void fullName() {
    firstName();
    space();
    lastName();
  }
}

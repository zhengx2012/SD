public class ThreeVariables {
  public static void main(String[] args) {
    java.util.Scanner keyword = new java.util.Scanner(System.in);

    System.out.println("Please enter your deparment code: ");
    String deptCode = keyword.next();

    System.out.println("Please enter your salary: ");
    double salary = keyword.nextDouble();

    System.out.println("Please enter your employee ID: ");
    int employeeId = keyword.nextInt();

    System.out.println("Department code: " + deptCode + " " + "Salary: " + salary + " " + "Employee ID: " + employeeId);

    System.out.println("Department code: " + deptCode + "\t" + "Salary: " + salary + "\t" + "Employee ID: " + employeeId);

    System.out.println("Department code: " + deptCode + "\n" + "Salary: " + salary + "\n" + "Employee ID: " + employeeId);
  }
}

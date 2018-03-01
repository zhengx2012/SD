/* Write a program that defines four variables named score1, score2, score3, and score4 — one for each of a student's four test scores. Assign appropriate values to the variables. Define another variable named average in the program. Have the program calculate the average of the test scores and assign the result to the variable:
*/
public class StudentScores {
  public static void main(String[] args) {
    double score1 = 90.0, score2 = 89.0, score3 = 76.0, score4 = 87.0, average;

    average = (score1 + score2 + score3 + score4) / 4;

    System.out.println("Test scores of : " +score1 + ", " +score2 + ", " + score3 + ", " + score4 + ", equaled an average of: " + average);
  }
}

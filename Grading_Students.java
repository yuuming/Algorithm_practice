/**
 * Created by yuminakamura on 2018-11-02.
 */

import java.io.*;
        import java.math.*;
        import java.text.*;
        import java.util.*;
        import java.util.regex.*;

public class Grading_Students {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int arrayLength = grades.length;
        int[] finalGrades = new int[arrayLength];
        for (int i=0; i<grades.length; i++) {
            if(grades[i]<38){
                finalGrades[i] = grades[i];
            }else if(grades[i]>=38 && grades[i]<=40){
                finalGrades[i] = (5 - grades[i]%5) + grades[i];
            }else if(grades[i]%5 >= 3){
                finalGrades[i] = (5 - grades[i]%5) + grades[i];
            }else{
                finalGrades[i] = grades[i];
            }
        }

return finalGrades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
        }
    }
}

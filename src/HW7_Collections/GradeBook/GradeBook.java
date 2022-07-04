package HW7_Collections.GradeBook;

import java.util.*;

public class GradeBook {

    public static void main(String[] args) {

        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        System.out.println("::Final grades::");

        for (String student : namesOfStudents) {
            if (firstTest.get(student) > secondTest.get(student)) {

                gradeBookMap.put(student, firstTest.get(student));

            } else gradeBookMap.put(student, secondTest.get(student));

        }
        for (Map.Entry<String, Integer> entry : gradeBookMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}


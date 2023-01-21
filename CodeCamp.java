
import java.util.ArrayList;
import java.util.Random;
import java.awt.*;

public class CodeCamp {

    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        int result = -1;
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople +
                    ", numDaysInYear: " + numDaysInYear);
        }

        ArrayList<Integer> birthdays =new ArrayList<>();
        //Generating birthdays and storing in arraylist birthdays
        Random r = new Random();
        int max = numDaysInYear;
        for(int i=0; i<numPeople; i++){
            birthdays.add(i, r.nextInt(max));
        }

        // ---

        //checking for pairs in ArrayList
        ArrayList<Point> pairs=new ArrayList<>();

        for(int i=0; i<birthdays.size(); i++){

            for(int j=i+1; j<birthdays.size() ;j++){
                if(birthdays.get(j)==birthdays.get(i)){
                    pairs.add(new Point(i,j));
                }
            }
        }

        
        result= pairs.size();
        return result;
    }


    public static void main(String[] args) {
        String newline = "\n";


        // test 21, sharedBirthdays, simple test
        int pairs = CodeCamp.sharedBirthdays(1, 365);
        System.out.println(newline + "Test 21 shared birthdays: expected: 0, actual: " + pairs);
        int expectedShared = 0;
        if (pairs == expectedShared) {
            System.out.println("passed test 21, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 21, shared birthdays");
        }
        
        // test 22, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(366, 365);
        System.out.println(newline + "Test 22 shared birthdays: expected: "
                + "a value of 1 or more, actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 22, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 22, shared birthdays");
        }
        
        // test 23, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(2, 1);
        System.out
                .println(newline + "Test 23 shared birthdays: expected: 1" + ", actual: " + pairs);
        if (pairs == 1) {
            System.out.println("passed test 23, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 23, shared birthdays.");
        }
        
        // test 24, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(3, 1);
        System.out
                .println(newline + "Test 24 shared birthdays: expected: 3" + ", actual: " + pairs);
        if (pairs == 3) {
            System.out.println("passed test 24, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 24, shared birthdays. "
                    + "Expected pairs to be 3. Value returned: " + pairs);
        }
        
        // test 25, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(4, 1);
        System.out
                .println(newline + "Test 25 shared birthdays: expected: 6" + ", actual: " + pairs);
        if (pairs == 6) {
            System.out.println("passed test 25, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 25, shared birthdays. "
                    + "Expected pairs to be 6. Value returned: " + pairs);
        }
        
        // test 26, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(5, 1);
        System.out
                .println(newline + "Test 26 shared birthdays: expected: 10" + ", actual: " + pairs);
        if (pairs == 10) {
            System.out.println("passed test 26, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 26, shared birthdays. "
                    + "Expected pairs to be 10. Value returned: " + pairs);
        }
        
        // test 27, sharedBirthdays, simple test
        pairs = CodeCamp.sharedBirthdays(100, 1);
        System.out.println(
                newline + "Test 27 shared birthdays: expected: 4950" + ", actual: " + pairs);
        if (pairs == 4950) {
            System.out.println("passed test 27, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 27, shared birthdays. "
                    + "Expected pairs to be 4950. Value returned: " + pairs);
        }
        
        // test 28, sharedBirthdays, stress test
        pairs = CodeCamp.sharedBirthdays(100000, 100);
        System.out.println(
                newline + "Test 28 shared birthdays - stress test. (Is solution slow?) : expected: > 0"
                        + ", actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 28, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 28, shared birthdays. "
                    + "Expected at least 1 pair. Value returned: " + pairs);
        }
        
        // test 29, sharedBirthdays, stress test
        pairs = CodeCamp.sharedBirthdays(100000, 100000);
        System.out.println(
                newline + "Test 29 shared birthdays - stress test. (Is solution slow?) : expected: > 0"
                        + ", actual: " + pairs);
        if (pairs > 0) {
            System.out.println("passed test 29, shared birthdays");
        } else {
            System.out.println("***** FAILED ***** test 29, shared birthdays. "
                    + "Expected at least 1 pair. Value returned: " + pairs);
        }
        

    }
}

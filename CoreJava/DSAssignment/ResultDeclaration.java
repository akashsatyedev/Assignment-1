package BasicDSAssignment;

import java.util.Scanner;

public class ResultDeclaration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        checkResult(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }
    public static void checkResult(int sub1, int sub2, int sub3){
        if(sub1 > 60 && sub2 > 60 && sub3 > 60)
            System.out.println("Hey U are Satisfying all the Condition and is Awarded Passed");
        else if(((sub1 + sub2)>120) || ((sub2 + sub3) > 120)||((sub1 + sub3)>120))
            System.out.println("Promoted");
        else
            System.out.println("Failed");
    }
}

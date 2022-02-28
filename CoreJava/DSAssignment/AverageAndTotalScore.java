package BasicDSAssignment;

import java.util.Scanner;

public class AverageAndTotalScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sdt1 = new int[3];
        int[] sdt2 = new int[3];
        int[] sdt3 = new int[3];
        for(int i = 0; i < 3; i++) {
            sdt1[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++) {
            sdt2[i] = sc.nextInt();
        }
        for(int i = 0; i < 3; i++) {
            sdt3[i] = sc.nextInt();
        }
        System.out.println("Total Score of Student1 is " + totalScore(sdt1[0],sdt1[1],sdt1[2]));
        System.out.println("Avg Score of Student 1" + avgScore(sdt1[0],sdt1[1],sdt1[2]));
        System.out.println("Total Score of Student 2 " + totalScore(sdt2[0],sdt2[1],sdt2[2]));
        System.out.println("Avg Score of Student 2 " + avgScore(sdt2[0],sdt2[1],sdt2[2]));
        System.out.println("Total Score of Student 3" + totalScore(sdt3[0],sdt3[1],sdt3[2]));
        System.out.println("Avg Score of Student 3" + avgScore(sdt3[0],sdt3[1],sdt3[2]));
        System.out.println("Total Score for subject 1 " + totalScore(sdt1[0],sdt2[0],sdt3[0]));
        System.out.println("avg Score of sub1 " + avgScore(sdt1[0],sdt2[0],sdt3[0]));
        System.out.println("total Score of sub2 " + totalScore(sdt1[1],sdt2[1],sdt3[1]));
        System.out.println("avg Score of sub2 " + avgScore(sdt1[1],sdt2[1],sdt3[1]));
        System.out.println("total Score of sub3 " + totalScore(sdt1[2],sdt2[2],sdt3[2]));
        System.out.println("avg Score of sub3 " + avgScore(sdt1[2],sdt2[2],sdt3[2]));
    }
    static int avgScore(int marks1, int marks2, int marks3) {
        return (totalScore(marks1, marks2, marks3))/3;
    }
    static int totalScore(int marks1, int marks2, int marks3) {
        return marks1+marks2+marks3;
    }
}

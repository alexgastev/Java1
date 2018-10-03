/**
 * HomeWork1
 * Alexey Gastev
 */


public class HomeTask1 {
    public static void main(String[] args){
        float result1 = task1(1, 1, 1, 2);
        System.out.println("result1 = " + result1);
        boolean result2 = task2(1, 8);
        System.out.println("result2 = " + result2);
        String result3 = task3(5);
        System.out.println("result3 = " + result3);
        String result4 = task4 ("Alex");
        System.out.println("result 4 = Hello, " + result4);
        String result5 = task5 (150);
        System.out.println("result 5 = " + result5);
    }

    // task 1
    private static float task1(int a, int b, int c, int d) {
        float e = a * (b + (c/d));
        return e;
    }

    // task 2
    private static boolean task2(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // task 3
    private static String task3(int a) {
        String answer;
        if (a >= 0) {
            answer = "Positive";
        } else {
            answer = "Negative";
        }
        return answer;
    }

    // task 4
    private static String task4 (String name) {
        return name;
    }

    // task 5
    private static String task5(int year) {
        String TypeOfYear;
        if (year % 400 == 0) {
            TypeOfYear = "Visokosny";
        } else if (year % 100 == 0) {
            TypeOfYear = "Ne visokosny";
        } else if (year % 4 == 0) {
            TypeOfYear = "Visokosny";
        } else {
            TypeOfYear = "Ne visokosny";
        }
        return TypeOfYear;
    }
}

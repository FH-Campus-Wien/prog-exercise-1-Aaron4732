package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.print("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|"+ System.lineSeparator() +
                "(__/\\__ \\--/ __"+ System.lineSeparator() +
                "   \\___|----|  |   __"+ System.lineSeparator()  +
                "       \\ }{ /\\ )_ / _\\"+ System.lineSeparator()  +
                "       /\\__/\\ \\__O (__"+ System.lineSeparator()  +
                "      (--/\\--)    \\__/"+ System.lineSeparator()  +
                "      _)(  )(_"+ System.lineSeparator()  +
                "     `---''---`"+ System.lineSeparator() );
    }

    //todo Task 3
    public void sumOfLiterals(){
        char value0 = 'Z';
        int value1 = 0xface;
        int value2 = 012;
        long value3 = 80L;
        float value4 = 44e-1f;
        float value5 = 5.5f;
        double value6 = 8.88e1;
        double value7 = 99.9;

        int sum;
        sum = (value0 + value1 + value2 + (int)value3 + (int)value4 + (int)value5 + (int)value6 + (int)value7);
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();

        System.out.println(value1 + value2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        x -= y;
        y += x;
        x = y - x;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        }
        if (n2 > n1) {
            System.out.println("n2 > n1");
        }
        if (n1 == n2){
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int x = scanner.nextInt();

        if (x < 0 || x >= 100000 ){
            System.out.println("Invalid Revenue");
        }
        if (x >= 0 && x < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if (x >= 20000 && x < 50000){
            System.out.println("Average Sales Revenue");
        }
        if (x >= 50000 && x < 80000){
            System.out.println("Good Sales Revenue");
        }
        if (x >= 80000 && x < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int x = scanner.nextInt();

        switch (x){
            case 1: System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2: System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3: System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4: System.out.println("Your Commission Rate was set to 0.04");
                break;
            default: System.out.println("Your Commission Rate was set to 0.0");
        }

    }


    //todo Task 9
    public void leapyear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int x = scanner.nextInt();

        if (x%4 == 0 && x%100 != 0 || x%400 == 0){
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }

    }
    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int x = scanner.nextInt();
        int y = 0;

        while (x!= 0) {
            y *= 10;
            y += x % 10;
            x /= 10;
        }
        System.out.println(y);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
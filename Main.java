package learnprogramming.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);

        int age, var, n;
        int menuOption;
        do {

            menuOption = getChoice();

            switch (menuOption){
                case 1:
                    // read in age
                    System.out.print("The name is: ");
                    String name = sc.nextLine();
                    for (int i = 1; i <= 20; i++) {
                        System.out.println(name);
                    }
                    break;

                case 2:
                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    int doubleAge = 2 * age;
                    System.out.println(age);
                    System.out.println(doubleAge);
                    // print out age + double age
                    break;

                case 3:
                    // read in age
                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    if (age >= 13 && age <= 19)
                        System.out.println("You are a teenager");
                    else
                        System.out.println ("You are not a teenager");
                    break;

                case 4:
                    // read in int 3 to 50
                    System.out.print("Enter n: ");
                    n = sc.nextInt();
                    while(n < 3 || n > 50) {
                        System.out.println("Enter n: ");
                        n = sc.nextInt();
                    }
                    for (int i = n; i > 0; i--) {
                        for (int j = 0; j < i; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    //print out asterisks
                    break;

                default:
                    System.out.println("invalid choice");
            }
        } while (menuOption != 5);
    }
    private static void printHeader() {
        System.out.println("------------------------------");
        System.out.println("  Welcome to our menu program ");
        System.out.println("------------------------------");
    }

    private static int getChoice() {
        int menuOption = 0;
        printHeader();
        System.out.println("1) Enter your name and display it 20 times");
        System.out.println("2) Enter your age and display the doubled age");
        System.out.println("3) Is the user a teenager or not a teenager");
        System.out.println("4) Create a triangle of X�s as many rows as the value of the user's input");
        System.out.println("0) Exit the program.");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner (System.in);
        menuOption = sc.nextInt();

        return menuOption;
    }
}



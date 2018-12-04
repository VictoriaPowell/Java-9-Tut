import java.awt.*;
import java.util.Scanner;
public class Main {

    public static void chapter1() {
        //Chapter 1
        System.out.println("****CHAPTER 1 ****");
        System.out.println("Hello World");
        System.out.println("Victoria");
        Car blueSuby = new Car(25.5, "H1C34E5", Color.blue, false);
        Car redFord = new Car(13.9, "3DN243G", Color.red, true);
        System.out.println(redFord);
        redFord.changePaintColor(Color.pink);
        System.out.println( "\nBlue Subaru's License Plate: " + blueSuby.getLicensePlt());
        System.out.println( "Red Ford's License Plate: " + redFord.getLicensePlt());
        System.out.println(redFord);
    }

    public static void chapter2() {
        //Chapter 2
        System.out.println("****CHAPTER 2 ****");
        String userInput = "entertainment";
        String uppercase = userInput.toUpperCase();
        System.out.println(uppercase);
        char firstChar = userInput.charAt(0);
        System.out.println(firstChar);
        System.out.println("Contains: " + userInput.contains("enter"));
        System.out.println("Contains: " + userInput.contains("Enter"));
        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));

        System.out.println("Enter a word:");
        Scanner sc = new Scanner(System.in);
        String userInput_2 = sc.next();
        String uppercase_2 = userInput_2.toUpperCase();
        System.out.println(uppercase_2);
        char firstChar_2 = userInput_2.charAt(0);
        System.out.println(firstChar_2);
        System.out.println("Contains: " + userInput_2.contains("enter"));
        System.out.println("Contains: " + userInput_2.contains("Enter"));
        System.out.println("Contains: " + userInput_2.contains("Enter".toLowerCase()));

        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);
    }

    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] numbers2 = {31, 45, 22, 98, 10};

        String[] myfaveCandybars = {"Twix", "Hershey's", "Crunch"};
        System.out.println("Index 1: " + myfaveCandybars[1]);
        myfaveCandybars[2] = "Butterfinger";
        System.out.println("Index 2: "+ myfaveCandybars[2]);
        System.out.println("Length: " + myfaveCandybars.length);

    }
}

import java.util.Scanner;

public class NumberstoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        int word;
        boolean begin=true;
        System.out.println("\nEnter The Number - ");
        num=sc.nextLine();
        System.out.println("\nIn Words - \n");
        try {
            for (int i = 0; i < num.length(); i++) {
                word = Integer.parseInt(String.valueOf((num.charAt(i))));
                try{
                switch (word) {
                    case 0:
                        if (begin) {
                            System.out.print("Zero");
                            begin = false;
                        } else {
                            System.out.print(" " + "zero");
                        }
                        break;
                    case 1:
                        if (begin) {
                            System.out.print("One");
                            begin = false;
                        } else {
                            System.out.print(" " + "one");
                        }
                        break;
                    case 2:
                        if (begin) {
                            System.out.print("Two");
                            begin = false;
                        } else {
                            System.out.print(" " + "two");
                        }
                        break;
                    case 3:
                        if (begin) {
                            System.out.print("Three");
                            begin = false;
                        } else {
                            System.out.print(" " + "three");
                        }
                        break;
                    case 4:
                        if (begin) {
                            System.out.print("Four");
                            begin = false;
                        } else {
                            System.out.print(" " + "four");
                        }
                        break;
                    case 5:
                        if (begin) {
                            System.out.print("Five");
                            begin = false;
                        } else {
                            System.out.print(" " + "five");
                        }
                        break;
                    case 6:
                        if (begin) {
                            System.out.print("Six");
                            begin = false;
                        } else {
                            System.out.print(" " + "six");
                        }
                        break;
                    case 7:
                        if (begin) {
                            System.out.print("Seven");
                            begin = false;
                        } else {
                            System.out.print(" " + "seven");
                        }
                        break;
                    case 8:
                        if (begin) {
                            System.out.print("Eight");
                            begin = false;
                        } else {
                            System.out.print(" " + "eight");
                        }
                        break;
                    case 9:
                        if (begin) {
                            System.out.print("Nine");
                            begin = false;
                        } else {
                            System.out.print(" " + "nine");
                        }
                        break;
                    default:
                        System.out.print("Not a Digit" + " ");
                        break;
                }
                }catch (NumberFormatException E){
                    System.out.println("\n Not A Complete Digit Contains Invalid Character(s) \n");
                }

            }
        }catch (Exception E)
        {
            System.out.println("\nNot A Complete Digit Contains Invalid Character(s)\n");
          }
        sc.close();
    }

}

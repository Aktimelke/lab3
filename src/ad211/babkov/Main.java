package ad211.babkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("if the line ends with <ed> u will receive true, else - false");
        String line1 = scan.nextLine();
        System.out.println(checkEd(line1));
        System.out.println("u will get summary of the numbers in the line or 0 if there are not any numbers in the line");
        String line2 = scan.nextLine();
        System.out.println(sumNumbers(line2));
        System.out.println("get the longest block (same symbols in a row)");
        String line3 = scan.nextLine();
        System.out.println(longestBlock(line3));
        System.out.println("get all words in the line");
        String line4 = scan.nextLine();
        wordsInLine(line4);
        System.out.println("get mixed lines");
        System.out.println("Enter first line");
        String line5 = scan.nextLine();
        System.out.println("Enter second line");
        String line6 = scan.nextLine();
        System.out.println(mixedLines(line5,line6));


    }
    public static boolean checkEd(String line) {
        return line.endsWith("ed");
    }
    public static int sumNumbers (String line){
        int sum =0;
        for(int i =0; i<line.length(); i++){
            char num = line.charAt(i);
               if(Character.isDigit(num)){
                   sum += Character.getNumericValue(num);
               }
        }
        return sum;
    }

    public static int longestBlock(String line){
        int theLongestBlock = 0,j=0;
        char c = line.charAt(0);
        for(int i=0; i<line.length();i++){
            if(line.charAt(i)== c){
                j++;
            }
            else{
                c = line.charAt(i);
                j=1;
            }
            if(theLongestBlock< j){
                theLongestBlock = j;
            }
        }
        return theLongestBlock;
    }

    public static void wordsInLine (String line){
        String[] arr = line.split("\\s+ ");
        for (String s : arr) {
            System.out.println(s);
        }
        }

    public static String mixedLines(String line1, String line2){
        String mixedDone = "";
        int length = Math.min(line1.length(), line2.length());
        for(int i=0; i<length;i++){
            mixedDone = mixedDone + line1.charAt(i) + line2.charAt(i);
        }
        mixedDone = mixedDone + line1.substring(length) + line2.substring(length);
        return mixedDone;
    }
}
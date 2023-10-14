package LeetCode;

import jdk.nashorn.internal.ir.IfNode;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Palindrome_Number {


    public static boolean PalindromInt(int input){
        int reverseInput = 0;
        int inputNumber=input;
        while(inputNumber/10!=0){
           int YuNumber=inputNumber%10;
            reverseInput=(10*reverseInput)+YuNumber;
            inputNumber=inputNumber/10;
           if (inputNumber==1){
               reverseInput=reverseInput*10+1;
           }
        }
        System.out.println("reverseNumber = " + reverseInput);
        System.out.println("input = " + input);

        if (reverseInput==input) return true;
        else if (input<0) {
            return false;
        } else if (input/10==0) {
            return true;
        } else return false;
    }













    public boolean PalindromeNumber(String x){
        String[] Xarray=x.split("",x.length());
        ArrayList<String> list = new ArrayList<>(Arrays.asList(Xarray));
        ArrayList<String> reverselist = new ArrayList<>();
        boolean result;
        for (int a=x.length()-1;a>=0;a--){
            reverselist.add(list.get(a));
        }
        System.out.println("list = " + reverselist);
        String reverseX=reverselist.toString();
        if (x.equals(reverseX)){
            result=true;
        }else {
            result=false;
        }
        System.out.println(result);
        return  result;

    }



    public static boolean isPalindrome_ForLoop(String input){
        // First we need to reverse input
         String result="";
        for (int i = input.length()-1; i >=0 ; i--) {
            result+=input.charAt(i);
        }
        if(result.equalsIgnoreCase(input)) return true;

        return false;
    }
    public static boolean isPalindrome(String input){
      // String builder class
        StringBuilder stringBuilder=new StringBuilder().append(input);
        String reversedString =stringBuilder.reverse().toString();
        if(reversedString.equalsIgnoreCase(input)) return true;
        return false;
    }


    public static void main(String[] args) {
//        Palindrome_Number palindromeNumber=new Palindrome_Number();
//        palindromeNumber.PalindromeNumber("Hi");
//        System.out.println(isPalindrome_ForLoop("Civic"));
//        System.out.println(isPalindrome("Civic"));
        System.out.println(Palindrome_Number.PalindromInt(313));
    }













}

package org.example;

//import java.util.Scanner;

public class sampleJavacode {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        String str = "A guy is sitting in a chair";
        int n = str.length();
        System.out.println(str.charAt(26));//index of String value, index is start from left side "0"
        String rstr= "";
        for( int i=n-1;i>=0;i--){
            rstr += str.charAt(i);
        }
        System.out.println(rstr);
        System.out.println(n);
    }


}

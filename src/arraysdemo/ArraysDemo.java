
package arraysdemo;

import java.util.Scanner;


public class ArraysDemo {

   //program to demo arrays to check commit
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myLetter = new char[myWord.length()];
        for(int i =0;i<myLetter.length;i++){
            myLetter[i]=myWord.charAt(i);
            System.out.print(myLetter[i]);
        }//end of for
        System.out.println("printing in reverse");
        for(int i= myLetter.length-1;i>=0;i--){
            System.out.print(myLetter[i]);
        }
    }
    
}


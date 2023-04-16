import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    // code goes here  

    String newStr = "";
    char aChar = ' '; 
    for(int i = str.length()-1 ; i>=0;i--){
      aChar = str.charAt(i);
      newStr = newStr + String.valueOf(aChar);
    }
    return newStr;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}

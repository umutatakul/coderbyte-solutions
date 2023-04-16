import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    // code goes here  
    int sonuc = 1;
    for(int i=num;i>0;i--){
      sonuc =sonuc * i;
    }
    
    return sonuc;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}

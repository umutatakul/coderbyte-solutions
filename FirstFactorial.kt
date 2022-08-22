fun FirstFactorial(num: Int): Int {

  // code goes here  
  var sonuc = 1
  for (a in 1..num){
    sonuc=sonuc * a
  }
  return sonuc;
  
}

fun main() {
  println(FirstFactorial(readLine()))
}
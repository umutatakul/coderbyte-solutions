fun FirstReverse(str: String): String {

  // code goes here  
  var n = str.length
  var reversedSentence = ""
  for (a in n-1 downTo 0){
    reversedSentence = reversedSentence.plus(str[a])
  }
  return reversedSentence
  
}

fun main() {
  println(FirstReverse(readLine()))
}
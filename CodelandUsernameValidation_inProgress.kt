fun CodelandUsernameValidation(str: String): String {
  var flag = true
  var capitalAlphabets = ('A'..'Z').toMutableList()
  var lowerCases = ('a'..'z').toMutableList()
  var numbers =('0'..'9')
  var n = str.length

  for (a in str){
    
    if(a in capitalAlphabets ){
      flag=true
    }else if(a in lowerCases){
      flag=true
    }else if( a in "_"){
      flag=true
    }else if(a in numbers){
      flag=true
    }
    else{
      flag=false
  
    }
  
    if(n>=4 && n<=25){
      flag=true
    }else{
      flag=false
    }
  }
  

  // code goes here  
  return flag.toString();
  
}

fun main() {
  println(CodelandUsernameValidation(readLine()))
}

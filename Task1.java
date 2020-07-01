import java.lang.StringBuilder;

class Task1{
public static void main(String[] args){
  System.out.println(solution(0));
}

public static String solution(int index){
  String primes = getPrimes();
  String id = getId(index, primes);
  return id;
}

private static String getPrimes(){
  StringBuilder sb = new StringBuilder();
  int currentNum = 2;
  while ( sb.length() < 10006 ){
    while( checkIfPrime(currentNum) == false ){
      currentNum ++;
    }
    sb.append( Integer.toString(currentNum) );
    currentNum ++;
  }
  return ( sb.toString() );
}

private static boolean checkIfPrime(int num){
  boolean prime = true;
  for(int i = 2; i <= num/2; i++){
    if(num % i == 0){
      prime = false;
      break;
    }
  }
  return prime;
}
private static String getId(int index, String primes){
  return (String.valueOf( primes.charAt(index) ) + String.valueOf( primes.charAt(index+1) ) + String.valueOf( primes.charAt(index+2) ) + String.valueOf( primes.charAt(index+3) ) + String.valueOf( primes.charAt(index+4) ));
}

}

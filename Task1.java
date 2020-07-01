import java.lang.StringBuilder;
/*
The task is to make a method that takes an int representing an index and
returns a 5 digit String consisting of the character at that index of a master
String, and the 4 following characters of the same master String.

The master String is a String consisting of all the prime numbers after one
another, and it is produced in this code.

There needs to be at least 10000 indexes to start at.
*/
class Task1{

// Main method to test. NOT SUBMITTED IN THE CHALLENGE.
public static void main(String[] args){
  System.out.println(solution(0));
}

// The solution method:
public static String solution(int index){
  String primes = getPrimes();
  String id = getId(index, primes);
  return id;
}

// Method to get the string of prime numbers:
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

// Method to check if a number is a prime number:
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

//Method that takes the master string and the index and returns a string with the 5 digit ID-code.
private static String getId(int index, String primes){
  return (String.valueOf( primes.charAt(index) ) + String.valueOf( primes.charAt(index+1) ) + String.valueOf( primes.charAt(index+2) ) + String.valueOf( primes.charAt(index+3) ) + String.valueOf( primes.charAt(index+4) ));
}

}

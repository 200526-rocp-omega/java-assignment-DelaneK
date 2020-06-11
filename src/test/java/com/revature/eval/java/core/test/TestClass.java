package com.revature.eval.java.core.test;

//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;

public class TestClass {


	public static void main(String[] args) {

		//toMilesPerHour(25.34);
		//printConversion(25.45);
		//printMegaBytesAndKiloBytes(5555);
		//areEqualByThreeDecimalPlaces(-3.1756, -3.175999) ;
		//areEqualByThreeDecimalPlaces(123.273633,123.273643);
		//getGreatestCommonDivisor(44, 12);
	    //sumFirstAndLastDigit(876676777);
		//reverse("Delane");
		//acronym("Weeds Aren't Cool");
		//cleanPhoneNumber(" 1 (920)-213-1479");
		//isPangram("aaiou");
		calculateNthPrime(10001);
		//int[] set = { 3, 5 };
		//getSumOfMultiples( 20, set);
		//calculatePrimeFactorsOf(901255);
	}
	

	public static List<Long> calculatePrimeFactorsOf(long l) {
		
		List<Long> prime = new ArrayList<Long>(); 
		List<Long> prime2 = new ArrayList<Long>();
		int num = 0;
		long templ = l;
	     while (l % 2 == 0) { 
	         System.out.println("WTF " + 2  + " "); 
	         System.out.println("l  = " + l ); 
	         
	         l /= 2; 
	         prime2.add(0,(long)2);
	         System.out.println("l/2  = " + l ); 
	     } 
	     	//l = templ;
	     System.out.println("l  = " + l ); 
	     // n must be odd at this point.  So we can 
	     // skip one element (Note i = i +2) 
	     //System.out.println("Math.sqrt(l) = " + Math.sqrt(l)); 
	    for (int i = 3; i <= l; i += 2) { 
	   /// 	System.out.println("WTF2 " + i + " "); 
	         // While i divides n, print i and divide n 
	         while (l % i == 0) { 
	             System.out.println("WTF3 " + i + " ");
	             prime2.add(0,(long)i);
	             l /= i; 
	             
	         } 
	         Collections.reverse(prime2);
	         Collections.sort(prime2);
	         System.out.println("prime2 = " + prime2);
	     }
		
	      
	    
	    
	    for (int i = 0; i < templ + 1; i++)   
	 	      
	       { 		  	  
	          int counter=0; 	  
	          //for(num =i; num>=1; num--)
	        	  for(num =1; num < templ; num++)
	          {
	             if(i%num==0)
	             {
	 		counter = counter + 1;
		     }
		  }
		  if (counter == 2)
		  {
		     //Appended the Prime number to the String
			  //prime.add(0,(long) 1);
			  prime.add(0,(long)i);
		     //System.out.println("primeArray[numOfPrimes] = " + " " + i +  " "  + numOfPrimes);
		     //numOfPrimes ++;		     
		     //ystem.out.println("numOfPrimes = " + numOfPrimes);
		     //System.out.println("primeNumbers = " + primeNumbers);
		    
		  }	
	       
		//System.out.println("prime = " + prime);
		//prime.add(0,(long) 1);
		//System.out.println("prime = " + prime);
	       }
	     System.out.println("prime = " + prime);
	     Collections.reverse(prime);
	     System.out.println("prime = " + prime);
		return prime;
	}

	
	public static int getSumOfMultiples(int iNum, int[] set) {

		/* If we list all the natural numbers below 20 that are multiples of 3 or 5, we
		  get 3, 5, 6, 9, 10, 12, 15, and 18.
		  
		 The sum of these multiples is 78.*/
		 
		int sumOf = 0;

		int[] setArray = new int[iNum];//set.length
		System.out.println("set.length " + set.length);
		for (int i = 0; i < set.length; i++) {
			for (int k = 0; k < iNum; k++) {
					/*if(iNum%set[k]== 0) {
						System.out.println("iNum%set[k] " + iNum%set[k]);
					}*/

				//System.out.println("set[0] " + set[0]);
				System.out.println("set[0]%iNum " + set[0]%iNum);
				//System.out.println("k = " + k);
				//if (iNum % set[0] == k) {
				//if(k>=set[0]) {
				//if ((k>=set[0]) && set[0]%iNum == k) {
					if ((k>=set[i]) && k%set[i] == 0) {
					System.out.println("k = " + k);
					System.out.println("set[0]%iNum= " + set[0]%iNum);
					System.out.println("iNum = " + iNum);
					System.out.println("set[i] = " + set[0]);
					System.out.println("iNum % set[0] = " + iNum % set[0]);
					if (setArray[k] == 0) {
						setArray[k] = 1;
					
						//if(k!=iNum)
						sumOf += k;
						System.out.println("sumOf = " + sumOf);
					}
				}
			}
		}

		System.out.println("sumOf " + sumOf);
		return sumOf;
	}
	
	public static int calculateNthPrime(int k) {
		
			int numOfPrimes = 0;
	      int num = 0;
	      int[] primeArray = new int[k*100]; 
	      String  primeNumbers = "";
	      if(k<1) {
	    	  throw new IllegalArgumentException("Invalid Input");
	      }
	       for (int i = 0; i < k*100 + 1; i++)   
	      
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
	          {
	             if(i%num==0)
	             {
	 		counter = counter + 1;
		     }
		  }
		  if (counter == 2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		     primeArray[numOfPrimes] = i;
		     System.out.println("primeArray[numOfPrimes] = " + " " + i +  " "  + numOfPrimes);
		     numOfPrimes ++;		     
		     System.out.println("numOfPrimes = " + numOfPrimes);
		     System.out.println("primeNumbers = " + primeNumbers);
		    
		  }	
	       }	
	       System.out.println("return primeArray[k-1] " +primeArray[k-1] );
	       return primeArray[k-1];
	}
	
	public static boolean isPangram(String string) {
		 
		string = string.toLowerCase();
		int isEnough = 0;
		Boolean boolArray[];    //declaring array
		boolArray = new Boolean[26];  // allocating memory to array
		//int intArray[];
		//intArray = new int[26];
		//Boolean[] boolArray = new Boolean[26];
		//Arrays.fill(array, Boolean.FALSE);
		System.out.println("boolArray = " + boolArray);
		for (int i = 0; i < string.length(); i++) {
			switch ((string.charAt(i))) {
			//System.out.println("Here");
			case ('a'):
				System.out.println("boolArray[0] = " + boolArray[0]);
				if(boolArray[0] == null)
				{
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[0] = true;
					break;
				}
				break;
			default:
				break;
			}
		}
	
		if(isEnough >= 26) {
			return true;
		}else {
		return false;
		}
	}
				
	public static String cleanPhoneNumber(String string) {
		
		//char tempChar = 's';
		//char tempChar2 = 's';
		String phoneNumber = new String();
		//int y = 0;
		// tempChar = string.charAt(i);
		// tempChar2 = string.charAt(i);
		for (int i = 0; i < string.length(); i++) {
		
			char x = string.charAt(i);
			int y = Character.getNumericValue(x); 
			if(y>=0) {
				phoneNumber += string.charAt(i);
			}
			 // 
		}
		System.out.println(phoneNumber); 
		return phoneNumber;
	}
	
	public static String acronym(String phrase) {
		
		String acronym = new String();
		String tempAcronym = new String();
		//String tempChar = phrase;
		char tempChar = 's';
		
		for(int i = 0; i < phrase.length(); i++){
			//tempChar = phrase.charAt(i);

			System.out.println("here " + tempChar);
			tempChar = phrase.charAt(i);
			if(Character.isUpperCase(tempChar)) {
					acronym += phrase.charAt(i);
					System.out.println("Capital");
					System.out.println(acronym);
				}
		
			else {
				System.out.println("Not Capital");
				System.out.println(phrase.charAt(i));
			}
		

		
		}
		
		System.out.println(tempAcronym);
		System.out.println(acronym);
		return acronym;
	}

/*	private static boolean isUpperCase(char charAt) {
		// TODO Auto-generated method stub
		return false;
	}*/

	public static String reverse(String string) {
		
		String reversedString = new String();
		System.out.println(string);

		for(int i = string.length() - 1; i >= 0; i--){
			reversedString += string.charAt(i);	
		}
		//System.out.println(reversedString);
		return reversedString;
	}
	
	public static int sumFirstAndLastDigit(int num) {

		int sumFirstAndLast = 0;
		int tempNum = num;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int length = String.valueOf(num).length();
		
		if(num<0) {
			return -1;
		}
		else {
			for(int i = 0; i < length; i++)
			{
				tempNum = num % 10;
				System.out.println("num%10 = " + num);
				numList.add(tempNum);
				num = num /10;
				System.out.println("num/10 = " + num);
			}
			System.out.println(num);
			System.out.println(numList);
			sumFirstAndLast = numList.get(0) + numList.get(numList.size()-1);
			System.out.println(sumFirstAndLast);
			return sumFirstAndLast;
		}

	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		

		ArrayList<Integer> firstArray = new ArrayList<Integer>();
		ArrayList<Integer> secondArray = new ArrayList<Integer>();
		int greatestcommondivisor = 0;
		int tempGCD = 0; 
		
		if( first< 10 || second < 10) {
			return -1;
		}
		else {
			for(int i = 1; i <= first; i++)
			{
				if(first%i == 0) {
					firstArray.add(i);
				}
			}
			for(int i = 1; i <= second; i++)
			{
				if(second%i == 0) {
					secondArray.add(i);
				}
			}
			System.out.println(firstArray);
			System.out.println(secondArray);
			if(secondArray.size() >= firstArray.size() ) {
				for (int i = secondArray.size() - 1; i >= 0; i--) {
					for (int j = firstArray.size() - 1; j >= 0; j--) {
						if(secondArray.get(i) == firstArray.get(j)) {
							System.out.println(greatestcommondivisor);
							tempGCD = secondArray.get(i);
							}
							if(tempGCD > greatestcommondivisor) {
								greatestcommondivisor = tempGCD;
								System.out.println(greatestcommondivisor);
							}
							}
						
						}
					/*if(secondArray.get(i) > greatestcommondivisor) {
						greatestcommondivisor = secondArray.get(i);
						System.out.println(greatestcommondivisor);
					}*/
					}
				}
			 //ArrayList<Integer> revArrayList = new ArrayList<Integer>(); 
		     //   for (int i = secondArray.size() - 1; i >= 0; i--) { 
		        	// Append the elements in reverse order 
		      //      revArrayList.add(secondArray.get(i)); 
		      //  }
		        //System.out.println(revArrayList);
		
		return greatestcommondivisor;
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		
		firstNum = ((long)(firstNum * 1e3)) / 1e3;
		secondNum = ((long)(secondNum * 1e3)) / 1e3;
		System.out.println(firstNum);
		System.out.println(secondNum);
		if(firstNum == secondNum) {
			System.out.println("true");
			return true;
		}
		return false;
	} 
	public static long toMilesPerHour(double kilometersPerHour) {
		
		long miles = 0;
		double miles2 = kilometersPerHour*0.621371;
		System.out.println(miles2);
		System.out.println(Math.round(miles2));
		if(kilometersPerHour < 0)
		{
			return -1;
		}
		else
		{
			System.out.println(kilometersPerHour*0.621371);
			miles = (long)(kilometersPerHour*0.621371);
			System.out.println(miles);
			miles = Math.round((long)(kilometersPerHour*0.621371));
			System.out.println(miles);
			miles = Math.round(miles);
			System.out.println(miles);
			return miles;
		}
	}
	public static String printConversion(double kilometersPerHour) {

		// Local variable to hold the double miles
		double miles = 0;
		// Local variable to hold the return value
		//String str = "";
		
		// Test for invalid input value
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}
		else {
			miles = kilometersPerHour*0.621371;
			System.out.println(kilometersPerHour + "km/h = " + Math.round(miles) + "mi/h" );
		}
		return null;
	}
	public static String printMegaBytesAndKiloBytes(int kiloBytes) {
		
		// Local variables
		String str = "Invalid Value";
		int MB;
		int KB;
		
		if(kiloBytes < 0) {
			System.out.println(str);
			return str;	
		}
		else {
			MB = kiloBytes/1000;
			KB = Math.floorDiv(kiloBytes, MB);
			System.out.println(KB);
			//"XX KB = YY MB and ZZ KB";
			str = kiloBytes + " KB = " + MB + " MB and " + KB +  " KB";
			System.out.println(str);
			return str;
		}
	}
	/*public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
		
		DecimalFormat df = new DecimalFormat("#.###");   
		System.out.println(firstNum);
		System.out.println(secondNum);
		firstNum = Double.valueOf(df.format(firstNum));
		secondNum = Double.valueOf(df.format(secondNum));
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		if(firstNum == secondNum) {
			System.out.println("true");
			return true;
			
		}
		System.out.println("false");
		return false;
	}*/
	public void printYearsAndDays(long minutes) {
		
		String str = "Invalid Value";
		int years = (int)minutes/525600;
		System.out.println(years);
		if(minutes < 0) {
			System.out.println(str);
		}
		System.out.println(minutes + " min = YY y and ZZ d");
		//System.out.println(str);
	}
}

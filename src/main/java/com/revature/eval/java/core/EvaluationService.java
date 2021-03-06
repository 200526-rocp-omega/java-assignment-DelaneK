package com.revature.eval.java.core;

import java.math.BigDecimal;
//import java.util.Random;
//import java.util.Scanner;
//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationService {

	/**
	 * 1.A Speed Converter - Convert to MilesPerHour
	 * 
	 * Write a method called toMilesPerHour that has 1 parameter of type double with
	 * the name kilometersPerHour. This method needs to return the rounded value of
	 * the calculation of type long.
	 * 
	 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
	 * needs to return -1 to indicate an invalid value.
	 * 
	 * Otherwise if it is positive, calculate the value of miles per hour, round it
	 * and return it. For conversion and rounding use Math.round().
	 */
	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {

			// double local variable to hold the double miles
			double miles = 0;

			// Test for invalid input value
			if (kilometersPerHour < 0) {
				return -1;
			}
			// Else valid input then perform the conversion
			else {
				miles = kilometersPerHour * 0.621371;
				return Math.round(miles);
			}
		}

		/**
		 * 1.B Speed Converter - Print Conversion
		 * 
		 * Write another method called printConversion with 1 parameter of type double
		 * with the name kilometersPerHour. This method needs to return a String and
		 * needs to calculate milesPerHour from the kilometersPerHour parameter.
		 * 
		 * The String should print in the format: "XX km/h = YY mi/h"
		 * 
		 * XX represents the original value kilometersPerHour. YY represents the rounded
		 * milesPerHour from the kilometersPerHour parameter.
		 * 
		 * If the parameter kilometersPerHour is < 0, then print the text "Invalid
		 * Value"
		 */
		public static String printConversion(double kilometersPerHour) {

			// Local variable to hold the double miles
			double miles = 0;
			// Local variable to hold the return value
			String str = "Invalid Value";

			// Test for invalid input value
			if (kilometersPerHour <= 0) {
				return str;
			} else {
				miles = kilometersPerHour * 0.621371;
				System.out.println(kilometersPerHour + " km/h = " + Math.round(miles) + " mi/h");
				return (kilometersPerHour + " km/h = " + Math.round(miles) + " mi/h").toString();
			}
		}
	}

	/**
	 * 2. MegaBytes and KiloBytes
	 * 
	 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
	 * int with the name kiloBytes.
	 * 
	 * The method should return a String and it needs to calculate the megabytes and
	 * remaining kilobytes from the kilobytes parameter.
	 * 
	 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
	 * 
	 * XX represents the original value kiloBytes. YY represents the calculated
	 * megabytes. ZZ represents the calculated remaining kilobytes.
	 * 
	 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
	 * = 2 MB and 452 KB"
	 * 
	 * If the parameter kiloBytes is less than 0 then print the text "Invalid
	 * Value".
	 */
	public String printMegaBytesAndKiloBytes(int kiloBytes) {

		// Local variables
		String str = "Invalid Value";
		int MB;
		int KB;

		if (kiloBytes < 0) {
			System.out.println(str);
			return str;
		} else {
			MB = Math.toIntExact((long) (kiloBytes / 1024));
			System.out.println(MB);
			KB = (int) ((kiloBytes - MB * 1024));
			System.out.println(KB);
			str = kiloBytes + " KB = " + MB + " MB and " + KB + " KB";
			System.out.println(str);
			return str;
		}
	}

	/**
	 * 3. Barking Dog
	 * 
	 * We have a dog that loves to bark. We need to wake up if the dog is barking at
	 * night!
	 * 
	 * Write a method shouldWakeUp that has 2 parameters.
	 * 
	 * 1st parameter should be of type boolean and be named "barking". It represents
	 * if our dog is currently barking. 2nd parameter represents the hour of the day
	 * and is of type int with the name hourOfDay and has a valid range of 0-23.
	 * 
	 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
	 * that case return true.
	 * 
	 * In all other cases return false.
	 * 
	 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
	 */
	public boolean shouldWakeUp(boolean isBarking, int hourOfDay) {

		// Check for invalid parameter
		if ((hourOfDay < 0) || (hourOfDay > 23)) {
			return false;
		}
		//
		if ((hourOfDay < 8) || (hourOfDay > 22)) {
			if (isBarking) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 4. DecimalComparator
	 * 
	 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
	 * double.
	 * 
	 * The method should return boolean and it needs to return true if two double
	 * numbers are the same up to three decimal places.
	 * 
	 * Otherwise, return false;
	 */
	public boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {

		firstNum = ((long) (firstNum * 1e3)) / 1e3;
		secondNum = ((long) (secondNum * 1e3)) / 1e3;
		if (firstNum == secondNum) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 5. Teen Number Checker
	 * 
	 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
	 * Write a method named hasTeen with 3 parameters of type int.
	 * 
	 * The method should return boolean and it needs to return true if ONE of the
	 * parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return
	 * false.
	 */
	static class TeenNumberChecker {

		public static boolean hasTeen(int x, int y, int z) {

			if (isTeen(x) || isTeen(y) || isTeen(z)) {
				return true;
			} else {
				return false;
			}
		}

		// We can initialize isTeen method first
		// Then pass the parameter to hasTeen method
		public static boolean isTeen(int number) {

			if (number >= 13 && number <= 19) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * 6. Minutes To Years and Days Calculator
	 * 
	 * Write a method printYearsAndDays with parameter of type long named minutes.
	 * The method should return a String and it needs to calculate the years and
	 * days from the minutes parameter.
	 * 
	 * If the parameter is less than 0, print text "Invalid Value".
	 * 
	 * Otherwise, if the parameter is valid then it needs to return a message in the
	 * format "XX min = YY y and ZZ d".
	 * 
	 * XX represents the original value minutes. YY represents the calculated years.
	 * ZZ represents the calculated days.
	 */
	public String printYearsAndDays(long minutes) {

		String str = "Invalid Value";
		if (minutes < 0) {
			return str;
		} else {
			long years = minutes / 525600;
			long days = (minutes % 525600) / 1440;
			str = minutes + " min = " + years + " y and " + days + " d";
			return str;
		}
	}

	/**
	 * 7. Number In Word
	 * 
	 * Write a method called printNumberInWord. The method has one parameter number
	 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
	 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
	 * for any other number including negative numbers. You can use if-else
	 * statement or switch statement whatever is easier for you.
	 */
	public String printNumberInWord(int number) {

		switch (number) {
		case 0:
			return "ZERO";
		case 1:
			return "ONE";
		case 2:
			return "TWO";
		case 3:
			return "THREE";
		case 4:
			return "FOUR";
		case 5:
			return "FIVE";
		case 6:
			return "SIX";
		case 7:
			return "SEVEN";
		case 8:
			return "EIGHT";
		case 9:
			return "NINE";
		default:
			return "OTHER";
		}
	}

	/**
	 * 8. Greatest Common Divisor
	 * 
	 * Write a method named getGreatestCommonDivisor with two parameters of type int
	 * named first and second.
	 * 
	 * If one of the parameters is < 10, the method should return -1 to indicate an
	 * invalid value. The method should return the greatest common divisor of the
	 * two numbers (int).
	 * 
	 * The greatest common divisor is the largest positive integer that can fully
	 * divide each of the integers (i.e. without leaving a remainder).
	 * 
	 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
	 * divided by 1, 2, 3, 5, 6, 10, 15, 30
	 * 
	 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
	 * and there is no resulting remainder.
	 */
	public int getGreatestCommonDivisor(int first, int second) {

		ArrayList<Integer> firstArray = new ArrayList<Integer>();
		ArrayList<Integer> secondArray = new ArrayList<Integer>();
		int greatestcommondivisor = 0;
		int tempGCD = 0;

		if (first < 10 || second < 10) {
			return -1;
		} else {
			for (int i = 1; i <= first; i++) {
				if (first % i == 0) {
					firstArray.add(i);
				}
			}
			for (int i = 1; i <= second; i++) {
				if (second % i == 0) {
					secondArray.add(i);
				}
			}
			System.out.println(firstArray);
			System.out.println(secondArray);
			if (secondArray.size() >= firstArray.size()) {
				for (int i = secondArray.size() - 1; i >= 0; i--) {
					for (int j = firstArray.size() - 1; j >= 0; j--) {
						if (secondArray.get(i) == firstArray.get(j)) {
							System.out.println(greatestcommondivisor);
							tempGCD = secondArray.get(i);
						}
						if (tempGCD > greatestcommondivisor) {
							greatestcommondivisor = tempGCD;
							System.out.println(greatestcommondivisor);
						}
					}

				}

			}
		}

		return greatestcommondivisor;
	}

	/**
	 * 9. First and Last Digit Sum
	 * 
	 * Write a method named sumFirstAndLastDigit with one parameter of type int
	 * called number.
	 * 
	 * The method needs to find the first and the last digit of the parameter number
	 * passed to the method, using a loop and return the sum of the first and the
	 * last digit of that number.
	 * 
	 * If the number is negative then the method needs to return -1 to indicate an
	 * invalid value.
	 */
	public int sumFirstAndLastDigit(int num) {

		int sumFirstAndLast = 0;
		int tempNum = num;
		ArrayList<Integer> numList = new ArrayList<Integer>();
		int length = String.valueOf(num).length();

		if (num < 0) {
			return -1;
		} else {
			for (int i = 0; i < length; i++) {
				tempNum = num % 10;
				System.out.println("num%10 = " + num);
				numList.add(tempNum);
				num = num / 10;
				System.out.println("num/10 = " + num);
			}
			System.out.println(num);
			System.out.println(numList);
			sumFirstAndLast = numList.get(0) + numList.get(numList.size() - 1);
			System.out.println(sumFirstAndLast);
			return sumFirstAndLast;
		}

	}

	/**
	 * 10. Reverse String
	 * 
	 * Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 */
	public String reverse(String string) {

		String reversedString = new String();

		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString += string.charAt(i);
		}
		return reversedString;
	}

	/**
	 * 11. Acronyms
	 * 
	 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 */
	public String acronym(String phrase) {

		String acronym = new String();
		char tempChar = 's';
		char tempChar2 = 's';

		for (int i = 0; i < phrase.length(); i++) {
			System.out.println("here " + tempChar);
			if (i > 0) {
				tempChar2 = phrase.charAt(i - 1);
			}
			tempChar = phrase.charAt(i);
			if (Character.isUpperCase(tempChar) && !Character.isUpperCase(tempChar2)) {

				acronym += phrase.charAt(i);
				System.out.println(acronym);
			}

			else {
				System.out.println("Not Capital");
				System.out.println(phrase.charAt(i));
			}

		}

		System.out.println(acronym);
		return acronym;
	}

	/**
	 * 12. Triangles
	 * 
	 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
	 * triangle has all three sides the same length. An isosceles triangle has at
	 * least two sides the same length.
	 * 
	 * (It is sometimes specified as having exactly two sides the same length, but
	 * for the purposes of this exercise we'll say at least two.) A scalene triangle
	 * has all sides of different lengths.
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			sideOne = ((long) (sideOne * 1e3)) / 1e3;
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			sideTwo = ((long) (sideTwo * 1e3)) / 1e3;
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			sideThree = ((long) (sideThree * 1e3)) / 1e3;
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			BigDecimal premium = BigDecimal.valueOf(158660, 2);
			if (getSideOne() == getSideTwo()) {
				if (getSideTwo() == getSideThree()) {
					return true;
				}
			}
			return false;
		}

		public boolean isIsosceles() {
			if (isEquilateral()) {
				return true;
			} else if (getSideOne() == getSideTwo()) {
				return true;
			} else if (getSideOne() == getSideThree()) {
				return true;
			} else if (getSideTwo() == getSideThree()) {
				return true;
			} else {
				return false;
			}
		}

		public boolean isScalene() {
			if (getSideThree() != getSideTwo()) {
				if (getSideThree() != getSideOne()) {
					return true;
				}
			} else {
				return false;
			}
			return false;
		}
	}

	/**
	 * 13. Scrabble Score
	 * 
	 * Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 */
	public int getScrabbleScore(String string) {

		int scrabbleScore = 0;
		string = string.toLowerCase();

		for (int i = 0; i < string.length(); i++) {
			switch ((string.charAt(i))) {
			case ('b'):
				scrabbleScore += 3;
				break;
			case ('c'):
				scrabbleScore += 3;
				break;
			case ('m'):
				scrabbleScore += 3;
				break;
			case ('p'):
				scrabbleScore += 3;
				break;
			case ('y'):
				scrabbleScore += 4;
				break;
			case ('f'):
				scrabbleScore += 4;
				break;
			case ('h'):
				scrabbleScore += 4;
				break;
			case ('v'):
				scrabbleScore += 4;
				break;
			case ('w'):
				scrabbleScore += 4;
				break;
			case ('d'):
				scrabbleScore += 2;
				break;
			case ('g'):
				scrabbleScore += 2;
				break;
			case ('k'):
				scrabbleScore += 5;
				break;
			case ('x'):
				scrabbleScore += 8;
				break;
			case ('q'):
				scrabbleScore += 10;
				break;
			case ('z'):
				scrabbleScore += 10;
				break;
			default:
				scrabbleScore += 1;
				break;
			}
		}
		return scrabbleScore;
	}

	/**
	 * 14. Clean the Phone Number
	 * 
	 * Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {

		String phoneNumber = new String();

		for (int i = 0; i < string.length(); i++) {

			char x = string.charAt(i);
			if (Character.isAlphabetic(string.charAt(i))) {
				throw new IllegalArgumentException("Alphabetic characters not Allowed");
			}

			int y = Character.getNumericValue(x);
			if (y >= 0) {
				phoneNumber += string.charAt(i);

			}
			System.out.println(phoneNumber); //
		}
		if (phoneNumber.length() > 10) {
			System.out.println(">11");
			throw new IllegalArgumentException("Phone Number length greater than 11 not Allowed");

		}
		return phoneNumber;
	}

	/**
	 * 15. Recurring Word Counter
	 * 
	 * Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
}
	 */
	
	public Map<String, Integer> wordCount(String string) {
		
   	   boolean word = false;
   	   String[] currencies = string.split(" ");
   	   int[] wordCount =  new int[currencies.length];
   	   Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < currencies.length; i++) {
			//Looking for multiple words
		/*	if(map.toString().contains(currencies[i])){
				wordCount[i]++;
				map.put(currencies[i], wordCount[i]+1);
			}
			else {*/
				map.put(currencies[i], wordCount[i]+1);
			//{

			}
			
		System.out.println("map = " + map);
		return map;
	
		
		
	}
	/**
	 * 16. Armstrong Number
	 * 
	 * An Armstrong number is a number that is the sum of its own digits each raised
	 * to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 */
	public boolean isArmstrongNumber(int input) {

		int originalNumber, remainder, result = 0;
		originalNumber = input;
		int length = String.valueOf(input).length();

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, length);// 3
			originalNumber /= 10;
		}

		if (result == input) {

			System.out.println(input + " is an Armstrong number.");
			return true;
		} else {
			System.out.println(input + " is not an Armstrong number.");
			return false;
		}

	}

	/**
	 * 17. Prime Factors
	 * 
	 * Compute the prime factors of a given natural number. A prime number is only
	 * evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {

		List<Long> prime = new ArrayList<Long>();
		while (l % 2 == 0) {
			l /= 2;
			prime.add(0, (long) 2);
		}

		for (int i = 3; i <= l; i += 2) {
			while (l % i == 0) {
				prime.add(0, (long) i);
				l /= i;

			}
			Collections.reverse(prime);
			Collections.sort(prime);
			System.out.println("prime = " + prime);
		}
		return prime;
	}

	/**
	 * 18. Calculate Nth Prime
	 * 
	 * Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 */
	public int calculateNthPrime(int k) {

		int numOfPrimes = 0;
		int num = 0;
		int[] primeArray = new int[k * 10];
		String primeNumbers = "";
		if (k < 1) {
			throw new IllegalArgumentException("Invalid Input");
		}
		for (int i = 0; i < k * 10; i++)

		{
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
				primeArray[numOfPrimes] = i;
				System.out.println("primeArray[numOfPrimes] = " + " " + i + " " + numOfPrimes);
				numOfPrimes++;
				System.out.println("numOfPrimes = " + numOfPrimes);
				System.out.println("primeNumbers = " + primeNumbers);

			}
		}
		System.out.println("return primeArray[k-1] " + primeArray[k - 1]);
		return primeArray[k - 1];
	}

	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */
	public boolean isPangram(String string) {

		string = string.toLowerCase();
		int isEnough = 0;
		Boolean boolArray[]; // declaring array
		boolArray = new Boolean[26]; // allocating memory to array

		for (int i = 0; i < string.length(); i++) {
			switch ((string.charAt(i))) {
			case ('a'):
				System.out.println("boolArray[0] = " + boolArray[0]);
				if (boolArray[0] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[0] = true;
				}
				break;
			case ('b'):
				if (boolArray[1] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[1] = true;
				}
				break;
			case ('c'):
				if (boolArray[2] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[2] = true;
				}
				break;
			case ('d'):
				if (boolArray[3] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[3] = true;
				}
				break;
			case ('e'):
				if (boolArray[4] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[4] = true;
				}
				break;
			case ('f'):
				if (boolArray[5] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[5] = true;
				}
				break;
			case ('g'):
				if (boolArray[6] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[6] = true;
				}
				break;
			case ('h'):
				if (boolArray[7] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[7] = true;
				}
				break;
			case ('i'):
				if (boolArray[8] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[8] = true;
				}
				break;
			case ('j'):
				if (boolArray[9] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[9] = true;
				}
				break;
			case ('k'):
				if (boolArray[10] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[10] = true;
				}
				break;
			case ('l'):
				if (boolArray[11] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[11] = true;
				}
				break;
			case ('m'):
				if (boolArray[12] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[12] = true;
				}
				break;
			case ('n'):
				if (boolArray[13] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[13] = true;
				}
				break;
			case ('o'):
				if (boolArray[14] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[14] = true;
				}
				break;
			case ('p'):
				if (boolArray[15] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[15] = true;
				}
				break;
			case ('q'):
				if (boolArray[16] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[16] = true;
				}
				break;
			case ('r'):
				if (boolArray[17] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[17] = true;
				}
				break;
			case ('s'):
				if (boolArray[18] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[18] = true;
				}
				break;
			case ('t'):
				if (boolArray[19] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[19] = true;
				}
				break;
			case ('u'):
				if (boolArray[20] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[20] = true;
				}
				break;
			case ('v'):
				if (boolArray[21] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[21] = true;
				}
				break;
			case ('w'):
				if (boolArray[22] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[22] = true;
				}
				break;
			case ('x'):
				if (boolArray[23] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[23] = true;
				}
				break;
			case ('y'):
				if (boolArray[24] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[24] = true;
				}
				break;
			case ('z'):
				if (boolArray[25] == null) {
					isEnough++;
					System.out.println("isEnough " + isEnough);
					boolArray[25] = true;
				}
				break;
			default:
				break;
			}
		}
		if (isEnough >= 26) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 20. Sum of Multiples
	 * 
	 * Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 */
	public int getSumOfMultiples(int iNum, int[] set) {

		int sumOf = 0;

		int[] setArray = new int[iNum];// set.length
		System.out.println("set.length " + set.length);
		for (int i = 0; i < set.length; i++) {
			for (int k = 0; k < iNum; k++) {
				/*
				 * if(iNum%set[k]== 0) { System.out.println("iNum%set[k] " + iNum%set[k]); }
				 */

				// System.out.println("set[0] " + set[0]);
				System.out.println("set[0]%iNum " + set[0] % iNum);
				// System.out.println("k = " + k);
				// if (iNum % set[0] == k) {
				// if(k>=set[0]) {
				// if ((k>=set[0]) && set[0]%iNum == k) {
				if ((k >= set[i]) && k % set[i] == 0) {
					System.out.println("k = " + k);
					System.out.println("set[0]%iNum= " + set[0] % iNum);
					System.out.println("iNum = " + iNum);
					System.out.println("set[i] = " + set[0]);
					System.out.println("iNum % set[0] = " + iNum % set[0]);
					if (setArray[k] == 0) {
						setArray[k] = 1;

						// if(k!=iNum)
						sumOf += k;
						System.out.println("sumOf = " + sumOf);
					}
				}
			}
		}

		System.out.println("sumOf " + sumOf);
		return sumOf;
	}

	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas. Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random
	 * class.
	 */

	public int[] threeLuckyNumbers() {
		int[] threeLucky = { 0, 0, 0 };
		for (int i = 0; i < 3; i++) {
			threeLucky[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(threeLucky);
		return threeLucky;
	}

	/*
	 * 22. Easy Guessing Game
	 * 
	 * Create a program to generate a number between the given range: int x =
	 * minimum iny y = maximum (inclusive)
	 * 
	 * You must use the Math.random class to generate a random number between x and
	 * y.
	 */

	public int guessingGame(int x, int y) {
		int guess = 0;

		guess = (int) (Math.random() * y) + x;
		System.out.println("Random Number: " + guess);
		return guess;
	}
}

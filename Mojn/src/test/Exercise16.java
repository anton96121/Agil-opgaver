package test;

import java.util.Scanner;

public class Exercise16 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter a string:");
	String word = s.nextLine();
	int i = 0;
	int j = 1;
	String dummy = new String();
	while(true) {
		if (j<=(word.length()-1)) {
		dummy=dummy+word.charAt(j);}
		if (i<=(word.length()-1)) {
			dummy=dummy+word.charAt(i);
			i+=2;
			j+=2;}
		
		if (i>(word.length()-1) || j>(word.length()-1)) {
			break;
		}}
		if (dummy.length()!=word.length()) {
			dummy=dummy+word.charAt(word.length()-1);}
		System.out.println(dummy);
		


}}

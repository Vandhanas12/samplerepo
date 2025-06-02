package string;

public class Stringclassmethods {

	public static void main(String[] args) {
		String s="Hello world";
		
		System.out.println("length of string :" + s.length());
		
		System.out.println("character at index 4 :"+ s.charAt(4));
		
		String s1="hello world";
		System.out.println("equals to s1 :"+ s.equals(s1));
		
		System.out.println("equalsIgnoreCase of s1 :"+ s.equalsIgnoreCase(s1));
		
		String s2="";
		System.out.println("s2 is empty :"+ s2.isEmpty());
		
		String s3="Hai";
		System.out.println("concatination of s3 and s " +s.concat(s3));
		
		System.out.println("converts s3 toUpperCase:"+ s3.toUpperCase());
		
		System.out.println("converts s3 toLowerCase:" + s3.toLowerCase());
		
		System.out.println("contains rld:"+ s1.contains("rld"));
		
		System.out.println("replace 'e' by 'o':" + s1.replace('e','o'));
		
		// TODO Auto-generated method stub

	}
}

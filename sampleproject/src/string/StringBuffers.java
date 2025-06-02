package string;

public class StringBuffers {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer("Hello");

		//StringBuffer str = new StringBuffer();

		str.append("World");

		System.out.println("After append: "+str); //After append: Hello World

		

		str.insert(6, "Hi ");

		System.out.println("After inserting: "+str); //After inserting: Hello Hi World

		

		str.replace(0, 2,"Good");

		System.out.println("After replacing: "+str); //After replacing: Goodllo Hi World

		

		str.delete(0, 7);

		System.out.println("After deleting: "+str); //After deleting:  Hi World

		

		System.out.println(str.capacity()); //by default 16 + 5 (first input "Hello")

		

		System.out.println(str.length()); //9

		

		System.out.println("Substring is: "+str.substring(5, 8)); 

		System.out.println("Substring is: "+str.substring(4)); 

	}



}


	

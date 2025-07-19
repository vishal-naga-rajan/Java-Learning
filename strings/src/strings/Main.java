package strings;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String var="Hello World";
		String var2=" What's up?";
		System.out.println("Length of String: "+var.length());
		System.out.println("Uppercase of String: "+var.toUpperCase());
		System.out.println("Lowercase of String: "+var.toLowerCase());
		System.out.println("Index of 'r' String: "+var.indexOf("r"));
		System.out.println(var.concat(var2));
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println("Addition of these: "+z);
		String a="10";
		int b=20;
		String c=a+b;
		System.out.println("Addition of these: "+c);
		
		
	}

}

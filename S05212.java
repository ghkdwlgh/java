package jump2java;
import java.util.Scanner;

class Animals{
	String name;
	int age;
	
	Animals(String name, int a){
	this.name = name;
         age = age;	    
   }

}

public class S05212 {
	
	public static void main(String[] args) {
		Animals dog1 = new Animals();
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		Animals dog = new Animals(name, age);
		System.out.println(dog,age);
		System.out.println(dog,age);
		
	}
  }

 

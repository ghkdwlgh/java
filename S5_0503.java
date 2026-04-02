package jump2java;
class Animal1 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal1 {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog1 extends Dog1 {
	HouseDog1(String name) {
	    this.setName(name);
	} 
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}
public class S5_0503 {
	  public static void main(String[] args) {
	        HouseDog1 dog = new HouseDog1("happy");
	        System.out.println(dog.name);
	    }
	}


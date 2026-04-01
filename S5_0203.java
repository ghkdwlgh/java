package jump2java;
class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}
public class S5_0203 {
	  public static void main(String[] args) {
	        Animal cat = new Animal();
	        cat.setName("boby");  // 메서드 호출
	        System.out.println(cat.name);
	    }
}

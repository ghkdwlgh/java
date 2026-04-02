package jump2java;

public class S5_0306 {
	   void varTest(int a) {
	        a++;
	    }

	    public static void main(String[] args) {
	        int a = 1;
	        S5_0306 sample = new S5_0306();
	        sample.varTest(a);
	        System.out.println(a);
	    }
}

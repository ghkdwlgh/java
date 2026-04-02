package jump2java;

public class S5_0307 {
	 int varTest(int a) {
	        a++;
	        return a;
	    }

	    public static void main(String[] args) {
	        int a = 1;
	        S5_0307 sample = new S5_0307();
	        a = sample.varTest(a);
	        System.out.println(a);
	    }
	}


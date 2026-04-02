package jump2java;

public class S5_0309 {
	 int a;  // 객체변수 a

	    void varTest() {
	        this.a++;
	    }

	    public static void main(String[] args) {
	        S5_0309 sample = new S5_0309()	sample.a = 1;
	        sample.varTest();
	        System.out.println(sample.a);
	    }
	}


package jump2java;

public class S5_0308 {
	 int a;  // 객체변수 a

	    void varTest(S5_0308 sample) {
	        sample.a++;
	    }

	    public static void main(String[] args) {
	        S5_0308 sample = new S5_0308();
	        sample.a = 1;
	        sample.varTest(sample);
	        System.out.println(sample.a);
	    }
	}


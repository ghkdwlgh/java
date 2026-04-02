package jump2java;

public class S5_0305 {
	  void sayNick(String nick) {
	        if ("바보".equals(nick)) {
	            return;
	        }
	        System.out.println("나의 별명은 "+nick+" 입니다.");
	    }

	    public static void main(String[] args) {
	        S5_0305 sample = new S5_0305();
	        sample.sayNick("야호");
	        sample.sayNick("바보");  // 출력되지 않는다.
	    }
	}


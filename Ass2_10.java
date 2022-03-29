class Result {

    public void result() {
        System.out.println("This is Result class");
    }
}

class UGResult {
    public void result() {

        System.out.println("This is UGResult class.");
    }
}

class PGResult{
	    public void result()
	    {
	        System.out.println("This is PGResult class.");
	        
	    }
	}

public class Ass2_10{
    public static void main(String[] args) {
        PGResult pgResult = new PGResult();
        pgResult.result();

    }
}

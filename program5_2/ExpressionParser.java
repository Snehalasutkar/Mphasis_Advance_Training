package program5_2;

public class ExpressionParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text=(" 23  +  45  -  (  343  /  12  ) ");
        String[] m=text.split("\\s");
        for(String w:m) {
        	System.out.println(w);
        }
	}

}

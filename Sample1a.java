//return grade>=70? true : false;
//return grade>=70;
public class Main
{
	public static void main(String[] args) {
	    int grade = 69;
	    System.out.println ("Using ternary operator:"+ isTernary(grade));
	    System.out.println ("Using regular boolean operator: " + isRegular(grade));
	}
	
	public static boolean isTernary (int grade){
	    return grade >= 70 ? "Pass" : "Fail";
	}
	public static boolean isRegular (int grade) {
	    return grade >= 70;
	}
	
}

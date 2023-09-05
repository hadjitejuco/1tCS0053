public class Main
{
	public static void main(String[] args) {
	    int grade = 69;
	    System.out.println ("Using ternary operator:"+ isTernary(grade));
	    if (isRegular(grade)==true)
	    {
	        System.out.println ("Using regular boolean operator: " + "Pass" );
	    }else{
	        System.out.println ("Using regular boolean operator: " + "Fail" );
	    }
	    
	}
	//this is the string output part
	public static String isTernary (int grade){
	    return grade >= 70 ? "Pass" : "Fail";
	}
	//this is the boolean output part 
	public static boolean isRegular (int grade) {
	    return grade >= 70;
	}
	
}

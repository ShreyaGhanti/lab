//Q.2... Write a java class to develop an employee class object using
//constructor.
//The constructor hold initialized the emp name & emp Id for 5 Emp
//now write another class having name and from this class you have to
//create 5 employee objects but
//you are not allowed to use new keyword
abstract class example{
	
	 static void sete(int id, String name) {		
		 System.out.println("The id of the emp is:  " +id+  "   and name is  " +name);
		  }}
	public class aa {
	public static void main(String[] args) {
		example.sete(23, "Shreya");		//calling without creating new keyword
		example.sete(24, "Ram");
		example.sete(21, "ABC");
		example.sete(22, "CDF");
		example.sete(25, "XYZ");
	}
}

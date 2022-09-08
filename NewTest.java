
//can you create an object of a class from inside the scope of another class constructor.
//yes , it's possible.
class Test12{
}
public class NewTest {

	
	NewTest(){
			Test12 test=new Test12();
		}
		public static void main(String[] args) {
			NewTest obj =new NewTest();
	}

}

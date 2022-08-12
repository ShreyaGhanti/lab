//Swapping two variables refers to mutually exchanging the values of thevariables. Generally, this is done with the data in memory

public class Swapping{ 
public static void main(String[]args){
int a=10;
int b=20;
System.out.println("The numbers a and b are "+a+","+b );
int temp;
temp=a;
a=b;
b=temp;
System.out.println("The numbers after swapping a and b are "+a+","+b);
}
}

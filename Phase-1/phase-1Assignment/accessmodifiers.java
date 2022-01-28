class A
{  
private int a=40;  
public int b=20; 
int c=30;
protected int d=45;
}  
  
class Main extends A
{  
 public static void main(String args[]){  
   A obj=new A();  
   System.out.println(obj.b);//it prints 20  
   //System.out.println(obj.a);//it gives compile time errror since a is private variable
   System.out.println(obj.c);//it prints 30 as it belongs to same package
   System.out.println(obj.d);//it prints  45 as class B is extending class A 
   
   }  
}  }
class parent
{
 int m1(){ 
  System.out.println("Parent class m1()");
  return 10;
 }
}

class child extends parent
{
 int m1(){
  System.out.println("child class m1()");
  return 25;
 }

 public static void main(String[] args)
 {
  parent p = new child();
  p.m1();
 }
}
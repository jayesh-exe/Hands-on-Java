abstract class Test{
 Test(){
  System.out.println("abstract class constructor");
 }
 abstract void m1();
}
class Sample extends Test{
 void m1(){
  System.out.println("provided implementation");
 }
 public static void main(String[] args){
  Sample s = new Sample();
 }
}
class parent{
 void m1(){
  System.out.println("No args method");
 }
}
class child extends parent{
 void m1(int i){
  System.out.println("one args method");
 }
 public static void main(String[] args){
  //child c = new child();
  //c.m1();
  //c.m1(10);
  parent p = new child();
  p.m1();
  //p.m1(10); in case of method overloading when we call parent reference variable and child object the child's method cannot be called using parent's reference variable
 }
}
class Sample{
 int a = 10;
 public void m1()
 {
  System.out.println("we are in Sample clas");
 }
}
class Test1{
 public void m2(Sample t)
 {
  System.out.println(t.a);
  t.m1();
 }
 public static void main(String[] args)
 {
  Sample s = new Sample();
  Test t = new Test();
  t.m2(s);
  System.out.println("we are back to main");
 }
}

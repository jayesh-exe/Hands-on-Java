class parent{
 int a=10,b=20;
}

class child extends parent{
 int a=100,b=200;
 void m1(int a,int b){
  System.out.println(a+b);
  System.out.println(this.a+this.b);
  System.out.println(super.a+super.
b);
 }
 public static void main(String args[]){
  new child().m1(1000,2000);
 }
}
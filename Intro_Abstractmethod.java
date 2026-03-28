abstract class Banking{
 abstract void deposit();
 abstract void withdraw();
}

abstract class A extends Banking{
 void deposit(){
  System.out.println("deposit Rupees 20000/-");
 }
}

class B extends A{
 void withdraw(){
  System.out.println("withdraw Rupees 20000/-");
 }
}

class Driver{
 public static void main(String[] args){
  B b = new B();
  b.deposit();
  b.withdraw();
 }
}
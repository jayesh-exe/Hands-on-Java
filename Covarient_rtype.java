class Animal{
}
class Dog extends Animal{}

class parent{
 Animal m1(int a){
  System.out.println("parent class m1");
  return new Animal();
 }
}

class child extends parent{
 Dog m1(int i){
  System.out.println("child class m1");
  return new Dog();
 }
 public static void main(String[] args){
  child c = new child();
  c.m1(10);
 }
}
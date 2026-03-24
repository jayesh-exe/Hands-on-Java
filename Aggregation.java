class Address
{
 int hno;
 String state;
 String country;
 Address(int hno,String state,String country){
  this.hno = hno;
  this.state = state;
  this.country = country;
 }
}
class Hero
{
 String name;
 int age;
 double height;
 Address add;
 Hero(String name,int age,double height,Address add){
  this.name = name;
  this.age = age;
  this.height= height;
  this.add = add;
 }
 void show(){
  System.out.println("name "+name);
  System.out.println("age "+age);
  System.out.println("height "+height);
  System.out.println("Hno "+add.hno);
  System.out.println("State "+add.state);
  System.out.println("country "+add.country);
 }
 public static void main(String[] args)
 {
  Address a = new Address(12,"mp","India");
  Hero h = new Hero("Dhoni",35,6.2,a);
  h.show();
 }
}
class parent{
 void property(){
  System.out.println("cash + gold + land");
 }
 void marriage(){
  System.out.println("Marry deepika");
 }

}
class child1 extends parent{
 void marriage(){
  System.out.println("No father , i want to marry katrina");
 }
 public static void main(String[] args){
  parent p = new child();
  p.property();
  p.marriage();
 }
}
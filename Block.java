class Block
{
 {
  System.out.println("This is instance block!!");
 }
 static{
  System.out.println("This is Static block!!");
 }
 public static void main(String[] args)
 {
  System.out.println("We are in Main()!!");
  Block b = new Block();
 }
}
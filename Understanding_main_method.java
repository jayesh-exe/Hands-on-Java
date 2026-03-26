class Test{
//synchronized final 
public static void main(String[] args)   
 {
  System.out.println("postmortem of main method in java");
  System.out.println("main method in java not called by jvm");
  System.out.println(args[0]+args[1]);
  Test.main(10);
 }
public static void main(int i)   
 {
  System.out.println("main method in java not called by jvm");
 }

}
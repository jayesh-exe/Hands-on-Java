class Student
{
 int roll_no;
 static int coll_code;
 public static void main(String[] args)
 {
  Student virat = new Student();
  Student rohit = new Student();
  virat.roll_no = 32;
  rohit.roll_no = 35;
  rohit.coll_code = 133;
  System.out.println("Roll number of virat"+virat.roll_no);
  System.out.println("Roll number of rohit"+rohit.roll_no);
  System.out.println("collage code of virat "+ virat.coll_code);
  System.out.println("collage code of rohit "+rohit.coll_code);
  }
}

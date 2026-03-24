class Student
{
 String sname;
 int sid;
 Student(String sname,int sid)
 {
  this.sname = sname;
  this.sid = sid;
 }

 public static void main(String[] args)
 {
  Student dhoni = new Student("Dhoni",7);
  System.out.println("Students name "+dhoni.sname+" Student id "+dhoni.sid);
 }
}
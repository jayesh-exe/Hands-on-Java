class parent{
 parent(){
  System.out.println("parent class 0 args constructor");
 }
}

class child extends parent{
 child(){
  //super()-> by defallt if not initialised
  System.out.println("child class 0 args constructor");
 }

 child(int a){
  System.out.println("parent class 1 args constructor");
 }

 public static void main(String[] args){ 
  new child();
 }
}
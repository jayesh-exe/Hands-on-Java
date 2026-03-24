class Test0
{
 int a =10;

    public void m1() {
        System.out.println("Test class m1()");
    }
}

class Sample
{
 
    Test0 m2() {
        Test0 t = new Test0();
        return t;
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        Test0 t1 = s.m2();
        System.out.println(t1.a);
        t1.m1();
    }

}
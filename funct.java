class Test {
    public int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        //Test t = new Test();
        //int factorial = t.fact(5);
        System.out.println(new Test().fact(10));
    }
}
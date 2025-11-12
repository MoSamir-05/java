class Q4 {
    final int x = 10; // final variable (value change nahi ho sakti)

    void show() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
        obj.show();
    }
}

class Q1 {
    int a;
    
    Q1(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("Value of a = " + a);
    }

    public static void main(String[] args) {
        Q1 obj = new Q1(48);
        obj.show();
    }
}

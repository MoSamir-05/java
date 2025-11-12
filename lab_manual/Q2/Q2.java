class Parent {
    int num = 100;
}

class Q2 extends Parent {
    int num = 200;

    void show() {
        System.out.println("Child num = " + num);
        System.out.println("Parent num = " + super.num); 
    }

    public static void main(String[] args) {
        Q2 obj = new Q2();
        obj.show();
    }
}

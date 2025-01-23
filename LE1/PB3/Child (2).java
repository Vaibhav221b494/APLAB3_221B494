class Child extends Mother {
    @Override
    void show() {
        System.out.println("Child's  " );
    }

    static void staticShow() {
        System.out.println("Child's static show method");
    }
}
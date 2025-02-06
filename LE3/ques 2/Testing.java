interface Testable {
    void display();
}
class Test implements Testable {
    @Override
    public void display() {
        System.out.println("inside testable");
    }
}

public class Testing {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

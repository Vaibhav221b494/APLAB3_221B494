interface Testable {
    void display();
}
//class Test implements Testable {
//    @Override
//    public void display() {
//        System.out.println("inside testable");
//    }
//}
abstract class AbsTest implements Testable {
    @Override
    public void display() {
        System.out.println("inside AbsTest");
    }
}
public class Testing {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}

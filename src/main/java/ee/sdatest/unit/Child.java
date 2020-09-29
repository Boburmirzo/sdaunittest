package ee.sdatest.unit;

public class Child extends Parent {

    // Method overriding means that
    // reimplementing parent's method

    // Overloading
    @Override
    public void myName() {
//        super.myName();
        System.out.println("My name is John");
    }


    public void myName(String name1){

    }

    //    @Override
//    public void myName() {
//        super.myName();
//        System.out.println("My name is John");
//    }
}

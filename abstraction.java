// Abstraction

abstract class Parent{
                                                                        /* Abstract class with Abstarct method */
    int x;

    abstract public void print();
}

class child extends Parent{
    public void print(){
        System.out.println("Here i have declared this method.");
    }
}

public class abstraction{
    public static void main(String[] args) {

        child pr = new child();

        pr.print();
    }
}
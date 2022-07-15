interface Parent{

    void print();
    int getelement();
}

//  Here in INTERFACE, only Abstract methods exist here so by this we can achieve 100% Abstraction.

class child implements Parent{

    public void print(){
        System.out.println("Declared print method here");
    }

    public int getelement(){
        return 2;
    }
}
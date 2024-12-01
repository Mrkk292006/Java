class Constructor {
    int mark;
    int rolno;

    // it is a default constructor
    Constructor(){

    }
    // it is a parameter constructor
        Constructor(int num, int nu){
        System.out.println("This is a contructor paranthesis");
        mark = num;
        rolno = nu;
        System.out.println(mark);
        System.out.println(rolno);

    }
}
class Constructorr{
    public static void main(String[] args) {
                           // it is constructor
        Constructor c = new Constructor(75,64);

    }
}
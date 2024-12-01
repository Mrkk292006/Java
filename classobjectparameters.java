public class classobjectparameters{
    String name;
    int age;
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
class main{
    public static void main(String[] args){
        Param p = new Param();
        p.para("Kasivishal",18);

    }
}
class Param{
    public void para(String a, int b){
        classobjectparameters u = new classobjectparameters();
        u.name = a;
        u.age = b;
        u.display();
    }
}
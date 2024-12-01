class Form{
    String name;
    int age;

    public void display(){
        
        System.out.println("Your name is :"+name);
        System.out.println("Your age is :"+age);

    }
}
class main{
    public static void main(String[] args) {
        //object 1

        Form form = new Form();
        form.name = "Kasivishal";
        form.age = 18;
        form.display();

        //object 2 
        Form form2 = new Form();
        form2.name = "Dhuruv vikram";
        form2.age = 20;
        form2.display();
    }
}
import java.util.Scanner;
class Form{
    String name;
    int age;
    int rollno;

    public void display(){
        
        System.out.println("Your name is :"+name);
        System.out.println("Your age is :"+age);
        System.out.println("Your rollno is :"+rollno);

    }
    public static void main(String[] args) {
        Form form = new Form();

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter Your name ");
        form.name = input.nextLine();

        System.out.println(" Enter Your age ");
        form.age = input.nextInt();

        System.out.println(" Enter Your rollno ");
        form.rollno = input.nextInt();

        form.display();

        input.close();
    }
}
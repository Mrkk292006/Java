public class recursion {

    //Function call itself

    public static void function(int n){
        //Base case
        if(n == 1){
            System.out.println(1);
        }
        //Recursion case
        else{
            System.out.println(n);
            function(n-1);
        }
    }
    public static void main(String[] args) {
        function(5);
    }
}

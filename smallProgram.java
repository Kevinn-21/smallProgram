public class smallProgram {
    public static void main(String[] args) {
        int $s = 5;
        System.out.println($s);
        // int 5 = 5;  //error because can't start with number
        int uninitVar;
        // System.out.println(uninitVar);  //cant be used because not initialized
        if(true) {
            int x = 10;
            System.out.printf("%i is a local variable in the if-block", x);
        }
        // System.out.println(x);   //x can't be resolved because it is local to the if-block
    }  
}

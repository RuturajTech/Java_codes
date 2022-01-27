//an exception occured and handled

class Finaltest {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int data = 100/0;
            System.out.println(data);
        }catch(ArithmeticException ae){
            System.out.println("Inside Catch Block");
            System.out.println(ae);
        }
        finally{
            System.out.println("This is Finally Block");
        }

        System.out.println("End of code");
        
    }
}


// Inside try block
//Inside catch block
//java.lang.main Arithmetic Exception : /by zero
//This is Finally Block
//End of code
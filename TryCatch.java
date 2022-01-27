// how to handle exception using try catch block
class Demo2 {
    public static void main(String[] args) {
        System.out.println("Before Exception...");

        try{// we write or throw exception here
            System.out.println(10/0);
        }
        catch(ArithmeticException ae){
            System.out.println("In Catch Block");
            System.out.println(ae);
        }
        System.out.println("After Exception");
    }
}
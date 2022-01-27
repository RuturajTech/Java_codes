class Arexp{
    public static void main(String[] args) {
        try{
            int data = 100/0;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("Out of Exception");
    }
}

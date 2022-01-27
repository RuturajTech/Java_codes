//an exception occur but not handled

class Finaltest {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int data = 100/0;
            System.out.println(data);
        }catch(NullPointerException ne){
            System.out.println(ne);
        }
        finally{
            System.out.println("This is Finally Block");
        }

        System.out.println("End of code");
        
    }
}

//exception does not occur

class Finaltest {
    public static void main(String[] args) {
        try{
            int data = 100/5;
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
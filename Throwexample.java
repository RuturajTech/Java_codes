class thrweg{
     static void srushti(int age) {

        if(age < 18){
            throw new ArithmeticException("Not eligible for voter id");
        }
        else{
            System.out.println("Person is elegible for voter id");
        }
    }
    public static void main(String[] args) {
        srushti(21);
        System.out.println("End of code");    
    }
    
}
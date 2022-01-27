class Demo {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        Demo obj = null;
        // Demo obj = new Demo();
        obj.fun();
        System.out.println("After Exception");
    }
    void fun() {
        System.out.println("In Fun");
    }
}
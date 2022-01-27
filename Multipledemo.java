package Exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Demo3{
 
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(10/0);
            System.out.println(br.readLine());
        }catch(ArithmeticException ae){
            System.out.println("Handling Exception");
            System.out.println(ae);
        
        }
    }
}

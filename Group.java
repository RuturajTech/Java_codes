import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GroupDemo {
    int id;
    String name;
    
    GroupDemo(int i, String n){
        id = i;
        name = n;
    }
    void Display(){
        System.out.println(id+"\t"+name);
    }
}
class Employee{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        GroupDemo arr[] = new GroupDemo[5];
        for(int i = 0; i<5; i++){
            System.out.println("Enter Employee's ID : ");
            int id = Integer.parseInt(br.readLine());

            System.out.println("Enter Employee's Name : ");
            String name = br.readLine();

            arr[i] = new GroupDemo(id, name);
        }
        System.out.println("The EMployee data is : ");

        for(int i = 0; i<arr.length;i++){
            arr[i].Display();
        }
    }
}
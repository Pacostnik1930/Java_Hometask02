import java.io.File;
import java.io.FileWriter;

public class Task02 {
    public static void main(String[]args) {
        test();
    }
    public static void test(){
        StringBuilder sb = new StringBuilder();
        sb.append("Test".repeat(100));
        try{
            FileWriter f1 = new FileWriter("Test.txt");
            f1.write(String.valueOf(sb));
            f1.flush();
        
        }catch(Exception e){
            System.out.println("Fail");
        }
    }
}

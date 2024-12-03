import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        try{
            File text1 = new File("text1.txt");
            if(text1.createNewFile()){
                System.out.println("New File Created");
            }
            else{
                System.out.println("File Already Exists!!!!");
            }
            
        }
        catch(IOException e){
            System.out.println("Error!!!!!!!!!!!");
            e.printStackTrace();
        }
        
    }
}

import java.io.PrintWriter;

public class FileWriting {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("text1.txt");
            writer.println("This is the first line");
            writer.println("This is the second line");
            System.out.println("Written!!!!!!!!"); 
            writer.close();          
        } catch (Exception e) {
            System.out.println("Error!!!!!!!!!!");
            e.printStackTrace();
                }


    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {


    public static void LetsReadFromUser(){

        System.out.println("Give me something");

        try(InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr)) {
            String x = br.readLine();
            while(!x.contains("q")) {

                System.out.println(x);
            break;
            }
            }




        catch (IOException e){
            e.printStackTrace();

        }

    }

}

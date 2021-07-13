import java.io.*;

public class DataInputOutput {


    public static void writeDataToFile() {
        try (FileOutputStream fos = new FileOutputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task1.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF("Java T-Shirt");
            dos.writeInt(12);
            dos.writeDouble(19.99);
            dos.writeUTF("Java Mug");
            dos.writeInt(8);
            dos.writeDouble(9.99);
            dos.writeUTF("Duke Juggling Dolls");
            dos.writeInt(13);
            dos.writeDouble(15.99);
            dos.writeUTF("Java Pin");
            dos.writeInt(29);
            dos.writeDouble(3.99);
            dos.writeUTF("Java Key Chain");
            dos.writeInt(50);
            dos.writeDouble(4.99);

            System.out.println("task 1.1 Done");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readDataFromFile(){
        try (FileInputStream fis = new FileInputStream(gr.codelearn.io.Directory.FILE_DIRECTORY.getPath() + "task1.txt");
             DataInputStream dis = new DataInputStream(fis)){



          for(int i =0; i<5; i++){

              System.out.println(dis.readUTF()+ " " + dis.readInt() + " " + dis.readDouble());

          }
            System.out.println("task 1.2 done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

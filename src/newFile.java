import java.io.*;

public class newFile implements Serializable {

    private int width;
    private int height;

    public void setWidth (int w) {
        width = w;
    }

    public void setHeight (int h) {
        height = h;
    }

    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        System.out.println ("Введите имя нового файла (без указания формата): ");
        String fileName = reader.readLine();
        System.out.println("Введите формат нового файла: ");
        String formatName = reader.readLine();
        System.out.println("Создание файла завершено.");

        newFile myFile = new newFile();
        myFile.setWidth(50);
        myFile.setHeight(20);

        try {
            FileOutputStream fileStream = new FileOutputStream (fileName + "." + formatName);
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject (myFile);
            objectStream.close();
        } catch (Exception ex) {ex.printStackTrace();}
    }
}
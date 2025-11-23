import java.io.*;

public class Experiment8 {

    public static void readFile(String fileName) throws IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: Unable to read file.");
        }
        finally {
            if (br != null) {
                br.close();
                System.out.println("File closed.");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        readFile("file.txt");
    }
}

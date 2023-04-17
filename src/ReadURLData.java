import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ReadURLData {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.gmail.com");
            URLConnection uc = url.openConnection();
            System.out.println("Connection established...");
            InputStream rawdata = uc.getInputStream();
            InputStream buffer = new BufferedInputStream(rawdata);

            Reader reader = new InputStreamReader(buffer);
            int c;
            while ((c = reader.read()) != -1){
                System.out.println((char) c);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

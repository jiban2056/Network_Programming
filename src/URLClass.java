import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLClass {

    public static void main(String[] args) {

        try {
            URL u = new URL("https://www.facebook.com");
            System.out.println("Protocol :" + u.getProtocol() + "Host name :"
                    + u.getHost() + "Query: " + u.getQuery()+
            "Authority :" + u.getAuthority() + "Content" + u.getContent());

//            URLConnection conn = u.openConnection();
//            Object content = u.getContent();
//            System.out.println(conn + " open Connection");
            InputStream in = u.openStream();
            int c;
            while((c=in.read()) !=-1 )
                System.out.write(c);
            in.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}

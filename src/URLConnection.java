import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

//protected URLConnection(URL url)
//
//try{
//
//    URL u = new  URL("http://www.overcomingbias.com/");
//    URLConnection uc = u.openConnection();
//
//    //read from the URL
//        } catch (MalformedURLException ex)
//        {
//            System.err.println(ex);
//
//        } catch(IOException ex){
//        System.err.println(ex);
//        }
//
//public abstract void connect()throws IOException
//
//
class URL_Connectin{

    public static void main(String[] args) {
        try {
            URL url = new URL("www.gmail.com");
            URLConnection uc = url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
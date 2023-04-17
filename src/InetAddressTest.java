import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressTest

{
//
    public static void main(String[]args){
//        try{
//            InetAddress address = InetAddress.getByName("google.com");
//
//        }
//     catch(UnknownHostException e){
//            System.out.println(e.getMessage());
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter IP Address");

        String ip = scanner.nextLine();
        scanner.close();
        try {

            InetAddress hostname = InetAddress.getByName(ip);
            System.out.println("Hostname of " + ip + hostname.getHostName());
        }catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }

    }




}

// what is factory method?
// Explore getallbyname method in java
// convert  host numeric address to name address.
// what is static method in java?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    static String host = "127.0.0.1";
    static int port = 8089;

    public static void main(String[] args) {
        try(Socket clientSoket = new Socket(host, port);
            PrintWriter out = new PrintWriter(clientSoket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSoket.getInputStream()))) {
            out.println("Julia");
            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

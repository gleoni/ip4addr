package ip4addr;

import java.io.*;

public class App {

    public static void main(String args[]) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Ip4Address n = new Ip4Address(in.readLine());
        System.out.println(n);
        System.out.println(n.getIp4Class());
        System.out.println(n.getNetwork());
    }
}
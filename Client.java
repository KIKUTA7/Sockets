package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Client extends MiniJava{
    public static void main(String[] args) {
        try {
            Socket s = new Socket( "localhost",7899);

            // pw.println("HEllO");
            // pw.flush();
            // pw.close();
            // PrintWriter pw = new PrintWriter(s.getOutputStream());
            // pw.flush();
            // pw.close(); -> ertjeradi gamotana
            while (true)
            {
                String s1 = readString("client :");
                PrintWriter pw = new PrintWriter(s.getOutputStream());
                pw.println(s1);
                pw.flush();
                InputStreamReader in  = new InputStreamReader (s.getInputStream());
                BufferedReader br = new BufferedReader(in);
                String brs = br.readLine();
                System.out.println(brs);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


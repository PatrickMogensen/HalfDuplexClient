package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            Socket socket = new Socket("localhost", 6780);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());

            BufferedReader bufferedReader = new BufferedReader(isr);
            Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.println(bufferedReader.readLine());
                pw.println(scanner.nextLine());

            }

        } catch (Exception e){
            System.out.println(e);
        }    }
}

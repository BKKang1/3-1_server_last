import controller.Controller;
import readAPI.ReadData;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        try {
            ServerSocket s_socket = new ServerSocket(10000);
            Socket conn = s_socket.accept();

        } catch (IOException e) {

            e.printStackTrace();
        }


    }




}
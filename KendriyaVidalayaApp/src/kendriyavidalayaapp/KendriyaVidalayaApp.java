
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendriyavidalayaapp;
import java.io.*;
/**
 *
 * @author HP
 */

public class KendriyaVidalayaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ;
    }
    public static void OpenLogWite(String filename, String messageIndex, String message, String messageCompliment) {
        try {
            String messageSequence = messageIndex + "   " + message + "   " + messageCompliment;
            byte[] buffer = messageSequence.getBytes();
            FileOutputStream fileStream = new FileOutputStream(filename);
            fileStream.write(buffer);
            fileStream.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    public static FileOutputStream OpenLog(String filename) {
        try {
            FileOutputStream fileStream = new FileOutputStream(filename);
            return fileStream;
        } catch(IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public static class AppDeglate {
        public static void AppExit(int exitCmd) {
            switch (exitCmd) {
                case 1:
                    //App Exit Command
                break;
                case 2:
                    //App Exit with writing log
                break;
                case 3:
                    //App Exit with Parameters
                break;
                case 4:
                    //App Exit with both writing Log and Parameters
                break;
            }
        }
        public static int AppStart = 100;
        public static void Message(String message, String comments) {
          System.out.println(message.concat(comments));
        }

    }
    }


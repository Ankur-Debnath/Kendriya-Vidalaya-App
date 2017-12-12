/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendriyavidalayaapp;
//Code Imports
import java.net.*;
import java.awt.dnd.DnDConstants;
import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import kendriyavidalayaapp.KendriyaVidalayaApp.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;

import com.sun.xml.internal.txw2.Document;
/**
 *
 * @author HP
 */
public class AppFunctions {
    public class WebFunctions {
        public void New() {
            //
        }
        public void init() {
            //From Ankur Industries, LICENSED UNDER THE MIT LISENSE
        }
        //As we all know that providing good and standarized urls is a good practice. Thus expecting good and standarized URL(s)
        //from you.
        public boolean DownloadFileCommonsIO(String fileUrl,String fileDestinition) {
            try {
                
                if(fileUrl != "" & fileDestinition != "") {
                    OpenLogWrite("$(ApplicationRoot)/ApplicationLog.Log",appMessageNo += 1, "Trying to Download using Commons IO '" + fileUrl + "'.","This download function may fail.-AnkurAdmin");
                    saveFileFromUrlWithCommonsIO(fileDestinition,fileUrl);
                    return True;
                } else {return Flase;}
            }
            catch (MalformedURLException ex) {
                ex.printStackTrace();
                return False;
            }
            catch (IOException ex) {
                ex.printStackTrace();
                return False;
            }
        }
        public boolean DownloadFileJavaIO(String fileUrl,String fileDestinition) {
            try {
                if(fileUrl != "" & fileDestinition != "") {
                    OpenLogWrite("$(ApplicationRoot)/ApplicationLog.Log",appMessageNo += 1, "Trying to Download using Java IO '" + fileUrl + "'.","This download function may fail.-AnkurAdmin");
                    saveFileFromUrlWithJavaIO(fileDestinition,fileUrl);
                    return True;
                } else {return False;}
            }
            catch (MalformedURLException ex) {
                ex.printStackTrace();
                return False;
            }
            catch (IOException ex) {
                ex.printStackTrace();
                return True;            }
        }
        public String UploadFile(String targeturl,String parameter, File targetFile) {
            try {
                HttpClient httpclient = new DefaultHttpClient();
                httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
                HttpPost httppost = new HttpPost(url);
                MultipartEntity mpEntity = new MultipartEntity();
                ContentBody cbFile = new FileBody(file);
                mpEntity.addPart(parameter, cbFile);
                httppost.setEntity(mpEntity);
                HttpResponse response = httpclient.execute(httppost);
                HttpEntity resEntity = response.getStatusLine();
                httpclient.getConnectionManager().shutdown();
                return response;
            }
            catch (MalformedURLException ex) {
                ex.printStackTrace();
                return "1";
            }
            catch (IOException ex) {
                ex.printStackTrace();
                return "0";
            }
        }
        public static class UnionFeePay {
            public static New() {
                //Return a New Instance of this class
                return UnionFeePay.class.newInstance();
            }
        }
        public class Managment {
            void SetupNetwork(String DNSAddress) {
                /*This function sets up the School Resource Sharing Network
                This method is needed to be called before any SharingOp*/
                
            }
        }
    }
}

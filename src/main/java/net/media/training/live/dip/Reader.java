package net.media.training.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Reader {
    String path;
    public void setPath(String path) {
        this.path = path;
    }
    public ArrayList<String> readFile(String path) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                list.add(aLine);
            }
            reader.close();
        } catch(Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public String readFromDB() {
        URL url = null;
        try {
            url = new URL("http", "example.com", "/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString1 = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString1.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString1.toString();
    }
}

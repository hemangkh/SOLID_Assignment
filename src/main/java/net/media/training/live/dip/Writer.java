package net.media.training.live.dip;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Writer {
    public boolean writeFile(ArrayList<String> list, String path) {
        boolean status = false;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for(String line:list){
                writer.write(line);
            }
            writer.flush();
            writer.close();
            status = true;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public boolean writeToDB(String data){
        MyDatabase database = new MyDatabase();
        database.write(data);
        return true;
    }
}

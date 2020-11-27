package com.edu.IO;

import java.io.*;

/**
 * @program: base-java
 * @description: 字节流
 * @author: lihangyu
 * @create: 2020-11-27 11:26
 */
public class FileZIjieTest {
    public static void main(String[] args) {
        File file = new File("D:/Test.txt");
        FileOutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.write("1  钟哈哈 18".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        FileInputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int count=0;

            if(is!=null){
                while((count = is.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,count));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

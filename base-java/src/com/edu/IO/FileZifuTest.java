package com.edu.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: base-java
 * @description: 字符流 输入 输出
 * @author: lihangyu
 * @create: 2020-11-27 10:54
 */
public class FileZifuTest {
    public static void main(String[] args) {
        File file = new File("D:/Test.txt");
        FileZifuTest.fw();
        FileZifuTest.fr();
        file.delete();
    }
    public static   void fw(){
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:/Test.txt");
            fw.write("1  钟哈哈 18");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static   void fr(){
        FileReader fr = null;
        try {
            fr = new FileReader("D:/Test.txt");
            char[] buffer = new char[1024];
            int count;
            do{
                count = fr.read(buffer);
                if(count!=-1){
                    String text = new String(buffer,0,count);
                    System.out.println(text);
                }
            }while (count != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

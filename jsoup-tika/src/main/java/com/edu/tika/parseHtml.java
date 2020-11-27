package com.edu.tika;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.html.HtmlParser;
import org.apache.tika.sax.BodyContentHandler;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.xml.sax.SAXException;

import javax.swing.text.html.HTML;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @program: jsoup-tika
 * @description: 解析页面
 * @author: lihangyu
 * @create: 2020-11-27 10:17
 */
public class parseHtml {
    public static void main(String[] args) throws IOException {
        String url = "https://search.jd.com/Search?keyword=java&enc=utf-8&wq=java";

        try {
            Document document = Jsoup.parse(new URL(url),3000);
            String s = document.getElementsByClass("gl-warp clearfix").toString();

           // System.out.println(s);
            //detecting the file type
            BodyContentHandler handler = new BodyContentHandler();
            Metadata metadata = new Metadata();
            FileInputStream inputstream = null;
            try {
                File file = new File("D:/example.html");
                //  创建字符输出流
                FileWriter fw = new FileWriter(file);
                fw.write(s);
                fw.flush();
                fw.close();
                inputstream = new FileInputStream(file);

                ParseContext pcontext = new ParseContext();

                //Html parser
                HtmlParser htmlparser = new HtmlParser();
                htmlparser.parse(inputstream, handler, metadata,pcontext);
                System.out.println("Contents of the document:" + handler.toString());
                System.out.println("Metadata of the document:");
                String[] metadataNames = metadata.names();

                for(String name : metadataNames) {
                   // System.out.println(name + ":   " + metadata.get(name));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (SAXException e) {
                e.printStackTrace();
            } catch (TikaException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }




    }
}

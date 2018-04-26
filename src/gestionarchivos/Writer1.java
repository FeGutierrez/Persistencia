package gestionarchivos;
/* example Writer1.java in course examples */
/* using a simple FileWriter for String-based i/o */

import java.io.FileWriter;
public class Writer1{
    public static void main(String[] args) throws Exception{
        String file = args[0];
        String output = "Hello World!";
        FileWriter fw = new FileWriter(file);
        fw.write(output);
        fw.close();
    }
}



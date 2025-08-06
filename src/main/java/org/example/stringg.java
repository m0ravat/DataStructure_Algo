package org.example;
import java.io.*;
public class stringg {
    public static void strinG(){
        String newString2 = "Hey guys";
        newString2 = newString2.concat("!");

    }
    public static void stringBuffer(){
        // Use stringBuilder when single threaded usecase since more efficient.
        StringBuffer sb = new StringBuffer("HelloWorld");
        sb.insert(5," ");
        sb.append("!");
        sb.replace(0,5, "Hi");
        sb.delete(0,2);
        sb.reverse();
        int len = sb.length();
        StringBuffer sb2 = new StringBuffer(50);
        sb.append("Hi giys");
        char s = sb2.charAt(len-1);
        int capacity = sb2.capacity();
        sb2.deleteCharAt(2);
        sb2.ensureCapacity(60);
        sb2.setLength(100);
    }
}

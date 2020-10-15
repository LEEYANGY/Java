import java.sql.*;
import java.io.*;
public class Test {
    public static void main(String[] args) throws IOException {
           FileOutputStream out = new FileOutputStream("MyJava.java",false);
           out.write(89);
           out.write(65);
           out.write("你好".getBytes());
           out.close();
       }
}

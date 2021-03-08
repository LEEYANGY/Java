import java.io.*;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {

        //stringname是文件相对路径写入Boolean值如果true则直接在当前文件下追加内容false则将原来的文件替换
        FileOutputStream out = new FileOutputStream("MyJava.java", false);
        out.write(89);
        out.write(65);
        //字节流数组
        out.write("你好".getBytes());
        out.close();

        //读入文件
        FileInputStream fis = new FileInputStream("MyJava.java");
        //开始写入文件
        /*
        while循环结束循环条件，读取到len=-1时结束
        */
        int len = 0;//初始化,记录读取到的字节
        while ((len = fis.read()) != -1) {//判断变量len是否等于-1len=fis.read()把读取到的字节赋值给变量len
        //输入字节流
            System.out.println(len);
        //输出char类型数组
            System.out.println((char) len);
        }
        //释放资源
        fis.close();
        System.out.print("测试成功？");

        //输入流一次读取多个字节方法
        FileInputStream fis1 = new FileInputStream("readme.md");
        //要想读入一个文件，首先要创建一个byte类型的数组数组长度为2
        byte[] bytes = new byte[1000];
        //使用read方法让它放入字节数组
        int len1 = fis1.read(bytes);
        System.out.println(len1);
        System.out.println(Arrays.toString(bytes));
        System.out.print(new String(bytes));
        fis1.close();

        //文件的复制实现，两种方法原理大致相同1.new一个输入和输出使用字节输入流中的read方法输出流中的write方法把读取到的文件写入到目的地2.new一个输入和输出使用缓冲区后者可以快速将文件复制到指定目的地
        //
        FileInputStream fis2 = new FileInputStream("readme.md");
        FileOutputStream fos2 = new FileOutputStream("D:\\readme.md");
        //一次读取一个字节写入一个字节
        //使用这字节输入流对象中的read读取文件
        int len2 = 0;
        while ((len2 = fis2.read()) != -1) {
            fos2.write(len2);
        }
        System.out.print("isok?");

        //释放资源(先写的，后关闭，if写完了肯定读取完了)
        fos2.close();
        fis2.close();

        //使用数组缓冲读取多个字节，写入多个字节
        FileInputStream fis3 = new FileInputStream("readme.md");
        FileOutputStream fos3 = new FileOutputStream("D:\\readme.md");

        byte[] bytes2 = new byte[1024];
        int len3 = 0;
        while ((len3 = fis3.read()) != -1) {
            fos3.write(bytes2, 0, len3);
        }
        fos3.close();
        fis3.close();

        //System.out.print("总耗时:"+(e-s)+"毫秒");
    }
}

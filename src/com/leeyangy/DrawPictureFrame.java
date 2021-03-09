package com.leeyangy;

//导包
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//DrawPictureFrame继承自JFrame
public class DrawPictureFrame extends JFrame {
    //创建一个8位RGB
        BufferedImage bfimg=new BufferedImage(570,390,BufferedImage.TYPE_INT_BGR);
        //获得图像的绘图对象
        Graphics graphics=bfimg.getGraphics();
        //将绘图对象转换为2d样式
        Graphics2D graphics2D=(Graphics2D) graphics;
        //创建画布对象
        DrawPictureCanvas drawPictureCanvas=new DrawPictureCanvas();
        //定义前景色
        Color foreColor=Color.BLACK;
        Color backupColor=Color.WHITE;


        /**
         * 构造方法
         */
        public DrawPictureFrame() {
            //使窗体不能改变大小
            setResizable(false);
            //设置窗体标题
            setTitle("画 画小程序");
            //点击右上角关闭连同程序一起关闭
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //设置窗体位置和宽高
            setBounds(500,100,574,460);
            //组件初始化
            init();

        }

        private void init(){
            //用背景色设置绘图对象的颜色
            graphics2D.setColor(backupColor);
            //用背景色填充整个画布
            graphics2D.fillRect(0,0,570,390);
            //用前景色设置绘图对象的颜色
            graphics2D.setColor(foreColor);
            //设置画布图像
            drawPictureCanvas.setImage(bfimg);
            //将画布添加到窗体容器默认布局的中部位置
            getContentPane().add(drawPictureCanvas);
        }
        //主程序入口
        public static void main(String[] args) {
            //实例化对象
            DrawPictureFrame dpf=new DrawPictureFrame();
            //让其显示出来
            dpf.setVisible(true);
        }
}
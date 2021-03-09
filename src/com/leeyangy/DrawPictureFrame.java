package com.leeyangy;

import javax.swing.*;
    //DrawPictureFrame继承自JFrame
public class DrawPictureFrame extends JFrame {
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
        }

        public static void main(String[] args) {
            //实例化对象
            DrawPictureFrame dpf=new DrawPictureFrame();
            //让其显示出来
            dpf.setVisible(true);
        }
}
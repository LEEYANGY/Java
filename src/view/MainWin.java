package view;

import javax.swing.*;

public class MainWin extends JFrame {
        public MainWin(){
            //设置窗口大小
            setBounds(100,100,571,775);
            //锁定布局，不可被调整
            setResizable(false);
            //用到了Jlabel就需要给它一个自由的布局
            setLayout(null);
            //点击右上角关闭按钮，连同程序一块结束
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //将设置背景方法封装
            setBack();
            //绘制区域  ，需要重写方法，1给主窗体添加画布（要在背景之上）
            StaticPanel staticPanel=new StaticPanel();
            getLayeredPane().add(staticPanel);
        }

        /*
        *设置背景
        */
        void setBack(){
            //加载背景
            ImageIcon imageicon=new ImageIcon("img/bg.jpg");
            //把imageicon放入JLabel标签内
            JLabel jl=new JLabel(imageicon);
            //
            jl.setBounds(0,0,571,775);
            //获取主窗体的窗格
            getContentPane().add(jl);
        }
}
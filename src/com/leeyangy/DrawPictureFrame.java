package com.leeyangy;

//导包
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
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

        //初始化鼠标绘制横纵坐标和橡皮擦表示变量
        int x=-1;
        int y=-1;
        boolean rubber = false;

        /**
         * 构造方法，添加鼠标监听事件
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
            addListen();
        }

    /**
     * 组件初始化
     */
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

    /**
     * 组件初始化
     */
    private  void addListen(){
        //注册鼠标监听事件
        drawPictureCanvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            /**
             * 重写方法
             *当鼠标拖拽时
             */
            public void mouseDragged(final MouseEvent e) {
                // 如果x和y存在鼠标记录
                if(x>0 && y>0){
                    if(rubber){
                        //如果rubber为true，表示使用rubber
                        //绘图工具使用前景色
                        //在鼠标滑过的位置填充正方形
                        graphics2D.setColor(backupColor);
                        graphics2D.fillRect(x,y,10,10);
                    }
                    else {
                        //如果rubber标识为false，表示用画笔
                        //在鼠标滑过的位置画直线
                        graphics2D.drawLine(x,y,e.getX(),e.getY());
                    }
                }
                //获取鼠标xy位置
                y=e.getY();
                x=e.getX();
                //更新画布
                drawPictureCanvas.repaint();;
            }
        });
        drawPictureCanvas.addMouseListener(new MouseAdapter() {
            @Override
            //重写鼠标抬起方法
            //当鼠标释放时将鼠标恢复
            public void mouseReleased(final MouseEvent e) {
                //恢复鼠标横纵坐标
                x=-1;
                y=-1;
            }
        });
        }
        //主程序入口
        public static void main(String[] args) {
            //实例化对象
            DrawPictureFrame dpf=new DrawPictureFrame();
            //让其显示出来
            dpf.setVisible(true);
        }
}
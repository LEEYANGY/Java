package view;

import java.awt.*;
import javax.swing.JPanel;

public class StaticPanel extends JPanel{
    StaticPanel(){
        //和主窗体一样大
        setBounds(0,0,571,775);
    }

    @Override
    public void paintComponent(Graphics g){
        //设置颜色rgb a为透明度
        g.setColor(new Color(0,0,0,30));
        //绘制主屏
        g.fillRect(15,30,300,500);
        //排名区
        g.fillRect(15,405,200,130);
        //右侧排版
        g.fillRect(233,20,105,400);
        g.setColor(new Color(2,2,2,30));
        //得分区
        g.fillRect(233,30,90,70);
        //提示区
        g.fillRect(233,105,90,140);
        //操作区
        g.fillRect(233,255,90,90);
        //边框
        g.setColor(Color.WHITE);
        //画笔宽度设置为3像素3L
        ((Graphics2D)g).setStroke(new BasicStroke(3L));
        g.drawRect(13,28,204,364);
        g.drawRect(13,403,200,134);

     }
}

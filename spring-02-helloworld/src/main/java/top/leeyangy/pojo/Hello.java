package top.leeyangy.pojo;

/**
 * Created by leeyangy on 2021/7/23 1:21
 */
public class Hello {
    private String str;
    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str=str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}

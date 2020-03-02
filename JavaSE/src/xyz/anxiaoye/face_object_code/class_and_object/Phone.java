package xyz.anxiaoye.face_object_code.class_and_object;

/**
 * @ClassName Phone 定义一个手机类
 * 属性：品牌、价格、颜色、内存
 * 方法：打电话、看视频、发信息、玩游戏
 * @Author zhuye
 * @Date 2020/1/19 23:29
 */
public class Phone {

    /**
     * 成员变量
     */
    String brand;
    double price;
    String color;
    String memory;

    /**
     * 成员方法
     */
    public void call(String who) {
        System.out.println( "给" + who + "打电话" );
    }

    public void watchTV() {
        System.out.println( "看视频" );
    }

    public void sendMsg(String who) {
        System.out.println( "给" + who + "发信息" );
    }

    public void playGames(String who) {
        System.out.println( "和" + who + "玩游戏" );
    }
}

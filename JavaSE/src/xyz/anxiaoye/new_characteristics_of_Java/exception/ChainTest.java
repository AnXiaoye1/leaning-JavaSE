package xyz.anxiaoye.new_characteristics_of_Java.exception;

/**
 * @ClassName ChainTest
 * Create by zhuye on 2020/2/22.
 */
public class ChainTest {
    /**
     * test1()：抛出“喝高了”异常
     * test2()：调用test1()，捕获“喝高了”异常，包装成运行时异常，继续抛出
     * main方法中，调用test2()，尝试捕获test2()抛出的异常
     *
     * @param args
     */
    public static void main(String[] args) {
        ChainTest ct = new ChainTest();
        try {
            ct.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() throws DrunkException {
        throw new DrunkException( "开车别喝酒" );
    }

    public void test2() {
        try {
            test1();//有异常，需要被捕获
        } catch (DrunkException e) {
            //e.printStackTrace();//输出异常具体信息
            RuntimeException rec = new RuntimeException( "道路千万条，安全第一条~~~" );
            rec.initCause( e );
            throw rec;//抛出新异常
        }
    }
}

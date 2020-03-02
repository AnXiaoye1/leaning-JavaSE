package xyz.anxiaoye.new_characteristics_of_Java.exception;

/**
 * @ClassName DemoException
 * Create by zhuye on 2020/2/22.
 */
public class DemoException {
    public static void main(String[] args) {
        //实例化异常类对象
        DemoException tc = new DemoException();
        int result = tc.test();
        System.out.println( "test()方法执行了，返回值：" + result );
    }

    /**
     * divider(除数)
     * @return（结果） try-catch捕获while循环
     * 每次循环divider减一，result=result+100/divider
     * 如果：抛出异常，打印输出“抛出异常了”，返回-1
     * 否则：返回result
     */
    public int test() {
        int divider = 10;
        int result = 100;
        try {
            while (divider > -1) {
                divider--;
                result = result + 100 / divider;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();//打印异常的具体信息
            System.out.println( "抛出异常了" );
            return -1;
        }
    }
}

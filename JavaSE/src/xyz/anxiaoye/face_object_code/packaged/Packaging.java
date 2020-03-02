package xyz.anxiaoye.face_object_code.packaged;

/**
 * @ClassName Packaging 封装：将详细过程省略，只显示其接口
 * @Author zhuye
 * @Date 2020/1/21 22:01
 * 封装在Java中的体现
 * 1.方法本身就是一种封装
 * 2.关键字private也是一种封装
 */
public class Packaging {
    public static void main(String[] args) {
        int[] array = {23, 53, 12, 7, 54, 77, 84, 246, 742};
        int max = getMax( array );
        System.out.println( "最大值："+max );
    }

    /**
     * 给一个数组，得到这组数的最大值
     *
     * @param array
     * @return
     */
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

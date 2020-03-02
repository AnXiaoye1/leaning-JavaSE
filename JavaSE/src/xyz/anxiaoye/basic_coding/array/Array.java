package xyz.anxiaoye.basic_coding.array;

/**
 * @ClassName Array
 * @Author zhuye
 * @Date 2020/1/18 16:48
 * @Version 1.0
 * 数组：是一种容器，可同时放多个数据
 * <p>
 * 特点：1.数组是一种引用类型数据
 * 2.数组可放多个数据，但类型必须相同
 * 3.数组的长度（大小）在程序运行期间不可改变
 * <p>
 * 数组的初始化，在内存中创建一个数组，并赋给一些默认值
 * 1.动态初始化（指定长度）：格式：数组类型[] 数组名称 = new 数组类型[数组长度];
 * 2.静态初始化（指定内容）：
 * 格式1：数组类型[] 数组名称 = new 数组类型[] {元素1，元素2，...};
 * 格式2：数组类型[] 数组名称 = {元素1，元素2，...};
 * <p>
 * 【注意】：
 * 静态/动态标准初始化格式可以拆分为2个步骤
 * 而静态省略型格式不能拆分
 * <p>
 * 如果不确定数组中的内容，用动态初始化，确定数组内容则用静态初始化
 * <p>
 * 数组使用：
 * 直接打印数组名称，输出的是数组在内存中的地址哈希值
 * 使用动态初始化数组时，元素会有一个默认值：
 * 整数类型，默认为 0
 * 浮点类型，默认为 0.0
 * 字符类型，默认为 '\u0000'
 * 布尔类型，默认为 false
 * 引用类型，默认为 null
 * <p>
 * 索引编号越界异常
 */
public class Array {
    public static void main(String[] args) {
        int[] arrayA = new int[100];
        String[] sanGuo = new String[]{"曹操", "刘备", "诸葛亮", "关羽", "司马懿"};
        String[] motto = new String[]{"宁可我负天下人，休教天下人负我",
                "汉室倾颓，奸臣当道。备不量力，欲伸大义於天下",
                "欲思其利，必虑其害，欲思其成，必虑其败",
                "大丈夫既领重任，除死方休！",
                "夫将兵者，不战则守，不守则走，不走则逃，不逃则死"};
        //--------动态------------
        int[] cost;
        cost = new int[6];
        //--------静态-------------
        int[] age;
        age = new int[]{30, 23, 35, 32, 25};

        System.out.println( sanGuo );
        System.out.println( age );
        System.out.println( sanGuo[0] );
        System.out.println( age[2] );
        System.out.println( sanGuo[1] + "今年" + age[2] + "岁了" );

        System.out.println( "---------------他们说过----------------" );
        //数组的遍历,简写方式：数组名称.fori
        for (int i = 0; i < 5; i++) {
            System.out.println( sanGuo[i] + "在" + age[i] + "时说：“" + motto[i] + "”。" );
        }
        //获取数组长度：数组名称.length
        int len = sanGuo.length;
        System.out.println( "三国的风云人物的个数：" + len );

        //获取数组最值：最大/最小
        int max = age[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] > max) {
                max = age[i];
            }
        }
        System.out.println( "年纪最大为：" + max );
        int min = age[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] < min) {
                min = age[i];
            }
        }
        System.out.println( "年纪最小为：" + min );

        //遍历数组原来的样子
        System.out.println( "---------------原来顺序-------------" );
        printArray( age );

        System.out.println( "------------反转后的顺序------------" );
        /**
         * 数组反转
         * 初始化语句：int low=0,int high=age.length-1
         * 条件判断：low < high
         * 步进表达式：low++,high--
         * 循环体：用辅助变量
         */
        for (int low = 0, high = age.length - 1; low < high; low++, high--) {
            int temp = age[low];
            age[low] = age[high];
            age[high] = temp;
        }
        printArray( age );

        System.out.println( "------------输出刘备、诸葛亮、关羽的年龄总和及平均值------------" );
        int[] result = box( age[1], age[2], age[3] );
        System.out.println( "main方法中接受到的数组是：" );
        System.out.println( result );
        System.out.println( result[0] );
        System.out.println( result[1] );
    }

    /**
     * 打印一个数组（数组作为参数，传进去的是数组的地址值）
     *
     * @param array
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println( array[i] );
        }
    }

    /**
     * 要求传回 总和sum、平均值avg，把他们放在数组中（数组做返回值，返回的是数组的地址值）
     *
     * @param a
     * @param b
     * @param c
     * @return box 数组做返回值
     */
    public static int[] box(int a, int b, int c) {
        int sum = a + b + c; //总和
        int avg = sum / 3; //平均值
        //返回这两个数，用数组
        /*int[] box = new int[2];
        box[0] = sum;//总和
        box[1] = avg;//平均值*/
        int[] box = {sum, avg};
        System.out.println( "box方法内部的数组是：" );
        System.out.println( box );//地址值
        return box;
    }
}

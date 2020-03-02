package xyz.anxiaoye.face_object_code.class_of_String;

/**
 * 题目：
 * 定义一个方法，把数组{1，2，3}按照指定格式拼接成一共字符串：[word1#word2#word3]
 *
 * 分析
 * 1.定义一个int[]数组，内容是1，2，3
 * 2.定义一个方法，用来将数组变成字符串
 * 三要素：
 * 返回值类型：String
 * 方法名称：fromArrayToString
 * 参数列表：int[]
 * 3.格式：[word1#word2#word3]
 */
public class PractiseOne {
    public static void main(String[] args) {
        int[] array={1,2,3};

        String result=fromArrayToString( array );
        System.out.println(result);
    }
    public static String fromArrayToString(int[] array){
        String string = "[";
        for (int i = 0; i < array.length; i++) {
            if(i<array.length-1){
                string+="word"+array[i]+"#";
            }else {
                string+="word"+array[i]+"]";
            }
        }
        return string;
    }
}

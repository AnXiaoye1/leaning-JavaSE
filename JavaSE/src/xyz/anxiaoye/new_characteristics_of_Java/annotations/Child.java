package xyz.anxiaoye.new_characteristics_of_Java.annotations;

import java.lang.annotation.Documented;

/**
 * @ClassName Child
 * Create by zhuye on 2020/2/25.
 */
@Description(desc = "I am a class annotations", author = "zhu ye")
public class Child implements Person {
    @Override
    @Description( desc = "I am a method annotations",author = "zhu ye")
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void sing() {
        System.out.println("方法过时了");
    }
}

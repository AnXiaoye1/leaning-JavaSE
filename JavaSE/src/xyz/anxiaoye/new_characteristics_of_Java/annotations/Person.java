package xyz.anxiaoye.new_characteristics_of_Java.annotations;

/**
 * Create by zhuye on 2020/2/25.
 */
public interface Person {
    public String name();

    public int age();

    @Deprecated
    public void sing();
}

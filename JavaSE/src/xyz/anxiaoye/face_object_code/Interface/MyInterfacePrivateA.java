package xyz.anxiaoye.face_object_code.Interface;

/**
 * 抽取共有的方法，来减少重复的代码
 * 但这个公共的方法不应该被实现类使用，应该是私有的方法
 *
 * 从JDK9开始，接口中运行定义私有方法
 * 1.普通私有方法：解决多个默认方法重复代码问题
 * 2.静态私有方法：解决多个静态方法之间重复代码问题
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1！");
        methodCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2！");
        methodCommon();
    }
    public void methodCommon();
}

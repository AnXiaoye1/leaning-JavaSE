package xyz.anxiaoye.face_object_code.Interface.more_extends;

/**
 * 这个接口中有几个方法？4个
 * methodA（）源于MyInterfaceA
 * methodB（）源于MyInterfaceB
 * methodCommon（）源于MyInterfaceA和MyInterfaceB
 * method（）源于该接口
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("");
    }
}

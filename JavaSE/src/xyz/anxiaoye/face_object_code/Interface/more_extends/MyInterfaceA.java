package xyz.anxiaoye.face_object_code.Interface.more_extends;


public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}

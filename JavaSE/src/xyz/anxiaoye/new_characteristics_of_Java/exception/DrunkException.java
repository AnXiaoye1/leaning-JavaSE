package xyz.anxiaoye.new_characteristics_of_Java.exception;

/**
 * @ClassName DrunkException
 * Create by zhuye on 2020/2/22.
 * 自定义异常
 * 异常莲
 */
public class DrunkException extends Exception{

    public DrunkException() {
    }

    public DrunkException(String message){
        super(message);
    }
}

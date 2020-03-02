package xyz.anxiaoye.new_characteristics_of_Java.annotations;

import java.lang.annotation.*;


/**
 * Create by zhuye on 2020/2/25.
 *
 * @author zhuye
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention( RetentionPolicy.RUNTIME )
@Inherited
@Documented
public @interface Description {
    String desc();

    String author();

    int aget() default 18;
}

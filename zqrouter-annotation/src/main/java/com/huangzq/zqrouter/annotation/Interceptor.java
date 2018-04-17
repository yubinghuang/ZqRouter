package com.huangzq.zqrouter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Created by   Huangzq
 * @on 2018/4/17 下午2:51
 * @des TODO
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Interceptor {

    int priority();

    String name() default "default";
}

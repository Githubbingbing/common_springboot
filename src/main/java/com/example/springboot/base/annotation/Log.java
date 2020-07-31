package com.example.springboot.base.annotation;

import java.lang.annotation.*;

/**
 * 日志注解
 *
 * @author guibing.lin
 * @date 2020/7/30
 */
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String type() default "";
    String value() default "";
}

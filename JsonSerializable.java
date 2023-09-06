package com.programming.class_5.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {

}

package com.github.zxh.classpy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyRuntimeAnnotation(
        intValue = 100,
        strValue = "test",
        enumValue = ElementType.METHOD,
        classValue = String.class,
        annotationValue = @Target({}),
        arrayValue = {"X", "Y", "Z"}
)
public class AnnotatedClass {
    
    @MyRuntimeAnnotation(
        intValue = 123,
        strValue = "test",
        enumValue = ElementType.METHOD,
        classValue = String.class,
        annotationValue = @Target({}),
        arrayValue = {"X", "Y", "Z"}
    )
    public int f1 = 123;
    
    @MyRuntimeAnnotation(
        intValue = 456,
        strValue = "test",
        enumValue = ElementType.METHOD,
        classValue = String.class,
        annotationValue = @Target({}),
        arrayValue = {"X", "Y", "Z"}
    )
    public void m1() {
        
    }
    
}

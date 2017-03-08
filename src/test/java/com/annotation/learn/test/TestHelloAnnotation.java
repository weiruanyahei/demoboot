package com.annotation.learn.test;

import com.annotation.learn.HelloAnnotation;

import java.lang.annotation.Annotation;

/**
 * Created by ldy on 2017/3/8.
 */
@HelloAnnotation(say = "Hello world!")
public class TestHelloAnnotation {

    public static void main(String[] args) {
        HelloAnnotation annotation = TestHelloAnnotation.class.getAnnotation(HelloAnnotation.class);
        System.out.println(annotation.say());
    }
}

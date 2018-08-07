package com.hand.infra.util;

//在执行service之前与之后的事件增强
public class EventUtil {
    public static void BeforeInsertFilmEvent(){
        System.out.println("Before Insert Film Data");
    }

    public static void AfterInsertFilmEvent(){
        System.out.println("After Insert Film Data");
    }
}

package com.hspedu.date_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        //老韩解读
        //1. 使用now() 返回表示当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now(); //LocalDate.now();//LocalTime.now()
        System.out.println(ldt);   //2022-06-01T20:58:27.338

        //2. 使用DateTimeFormatter 对象来进行格式化
        // 创建 DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format); // 格式化的日期=2022-06-01 20:58:27

        System.out.println("年=" + ldt.getYear());  //年=2022
        System.out.println("月=" + ldt.getMonth());  //月=JUNE
        System.out.println("月=" + ldt.getMonthValue());  //月=6
        System.out.println("日=" + ldt.getDayOfMonth());  //日=1
        System.out.println("时=" + ldt.getHour());  //时=20
        System.out.println("分=" + ldt.getMinute());  //分=58
        System.out.println("秒=" + ldt.getSecond());  //秒=27

        LocalDate now = LocalDate.now(); //可以获取年月日
        LocalTime now2 = LocalTime.now();//获取到时分秒


        //提供 plus 和 minus方法可以对当前时间进行加或者减
        //看看890天后，是什么时候 把 年月日-时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        //890天后=2024-11-07 20:58:27
        System.out.println("890天后=" + dateTimeFormatter.format(localDateTime));

        //看看在 3456分钟前是什么时候，把 年月日-时分秒输出
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        //3456分钟前 日期=2022-05-30 11:22:27
        System.out.println("3456分钟前 日期=" + dateTimeFormatter.format(localDateTime2));

    }
}

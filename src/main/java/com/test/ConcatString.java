package com.test;

import java.math.BigDecimal;
import java.util.Date;

public class ConcatString {

    public static void main(String[] args) {
        String str = "begin";
        Date date = new Date();
        String[] arr = {"aa", "bb", "cc", "dd"};
        str = String.join(",", arr);
        System.out.println(String.join(",", arr));
        BigDecimal amount = new BigDecimal(23);
        System.out.println(str + date + amount);
    }
}

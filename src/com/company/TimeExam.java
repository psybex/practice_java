package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(ld1);
    }
}

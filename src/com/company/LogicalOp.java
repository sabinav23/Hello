package com.company;

public class LogicalOp {

    public boolean isLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}

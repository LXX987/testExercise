package com.softwaretest.sotfwaretesting.program;
import java.util.Scanner;
public class Calendar{
    /**
     * 万年历程序本身
     * @param y 年
     * @param m 月
     * @param d 日
     */
    public void calendarRun(int y, int m, int d) {
        int dnum = 0; //月里的天数
        boolean isLeap = false; //是否为闰年
        if(y<=0||y>=9999) {
            System.out.println("年不合法!");
        }
        if(m<=0||m>=13) {
            System.out.println("月不合法!");
        }

        //判断闰年
        //闰年：1.能被400整除 2.能被4整除，但不能被100整除
        if((y % 400 == 0)||(y % 4 == 0 && y % 100 != 0)){
            isLeap = true;
        }

        //用 switch 语句判断月份，求出该月份的天数
        //平年
        if(!isLeap){
            switch(m) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:dnum=31; break;
                case 4:case 6:case 9:case 11:dnum=30;break;
                case 2:dnum=28;break;
            }
        }
        //闰年
        else{
            switch(m) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:dnum=31; break;
                case 4:case 6:case 9:case 11:dnum=30;break;
                case 2:dnum=29;break;
            }
        }

        //判断日期是否合法
        if(d < 1 || d > dnum){
            System.out.println("日期不合法！");
            return;
        }

        //输出下一天
        if(d != dnum){
            d++;
        }
        else{
            if(m == 12){
                y++;
                m = 1;
                d =1;
            }
            else{
                m++;
                d = 1;
            }
        }
        System.out.println("下一天：");
        System.out.println(y + "-" + m + "-" + d);
    }
}


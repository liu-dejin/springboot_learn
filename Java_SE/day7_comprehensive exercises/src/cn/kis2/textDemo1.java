package cn.kis2;

import java.util.Scanner;

public class textDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入选择的仓位  0 头等舱 1经济舱");
        int seat = sc.nextInt();
        //判断月份

        // 抽疯     ctrl + alt + m
        if (month >= 5 && month <= 10) {
            ticket =  getPrice(ticket, seat, 0.9, 0.85);

        }
        else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {

            ticket =  getPrice(ticket, seat, 0.8, 0.75);


        } else {
            //非法数据
            System.out.println("输入的月份有误");
        }

        System.out.println(ticket);


    }

    //根据仓位和折扣计算票价
    public static int getPrice(int ticket, int seat,double v0,double v1){
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * v0);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * v1);
        } else {
            //非法数据
            System.out.println("没有这个仓位");
        }
        return ticket;
    }
}

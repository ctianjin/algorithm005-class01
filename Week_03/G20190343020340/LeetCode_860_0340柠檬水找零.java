package com.exercise.week_three;/** * @ClassName: * @Description: * @Author: * @Date: *//** *@ClassName LeetCode_860_0340柠檬水找零 *@Description *@Autor *@Date 2019/12/1521:27 *@Version 1.0 *@Example **/public class LeetCode_860_0340柠檬水找零 {    // 总结下，贪心不是非要递归，而是一种寻找每一步最优解的思想,从而达到全局贪心(具有局限性)    // 这道题的重要前提是顺序,每位顾客正确找零    public static void main(String[] args) {        int[] bills = {5,5,5,20,20};        System.out.println(lemonadeChange(bills));    }    //  每步最优    public static boolean lemonadeChange(int[] bills) {        int five = 0,ten = 0;        for (int money:bills) {            if (money == 5){                five++;            }            if (money == 10){                if (five > 0){                    five--;                    ten++;                }else {                    return false;                }            }            if (money == 20){                if (five > 0 && ten > 0){                    five --;                    ten --;                    continue;                }                if (five > 2){                    five -= 3;                    continue;                }                return false;            }        }        return true;    }}
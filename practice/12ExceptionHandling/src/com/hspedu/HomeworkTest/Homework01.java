package com.hspedu.HomeworkTest;

/**
 * @author wayne
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        try {
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("缺少命令行参数");
            }
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
            cal(num1,num2);
        } catch (NumberFormatException e) {
            System.out.println("数据格式不正确");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (ArithmeticException e) {
            System.out.println("除数为0");
        } finally {
            System.out.println("程序结束");
        }
        System.out.println();
    }

    static void cal(int n1 , int n2){
        int n3 = n1/n2;
        System.out.println(n3);
    }
}

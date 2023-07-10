package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wayne
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        Books[] books = new Books[4];
        books[0] = new Books("红楼",100);
        books[1] = new Books("三国演义",120);
        books[2] = new Books("西游记000",50);
        books[3] = new Books("水浒传",30);


        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Books i1 = (Books) o1;
                Books i2 = (Books) o2;
                return i1.name.length() - i2.name.length();
            }
        });
        System.out.println("===排序后===");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].name);
        }


    }
}


class Books{
    String name;
    int price;
    public Books(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
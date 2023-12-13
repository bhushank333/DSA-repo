package com.example.demo.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

public class BookTest {

    public static void main (String[] args){
//        Predicate<Integer> pd = (num) -> num % 2 == 0;
//        boolean b = pd.test(10);
//        System.out.println(b);
        HashSet<String> hashSet = new HashSet<String>(); // 16 internally size increase
        hashSet.add("10"); // 16*0.75 =12
        hashSet.add("20");
        hashSet.add("30"); // 13th element
        hashSet.add(null);

        Iterator<String> itr = hashSet.iterator();

        if(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

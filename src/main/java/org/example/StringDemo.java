package org.example;

public class StringDemo {
    void joinWords (String[] names){
        String sentence = "";
        StringBuffer sb = new StringBuffer("");
        for (String name : names) {
            System.out.println("StringBuffer hashcode " + sb.hashCode());
            sentence = sentence + name;
            System.out.println(sentence.hashCode());
        }
    }
}

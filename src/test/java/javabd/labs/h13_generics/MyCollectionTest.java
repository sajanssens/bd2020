package javabd.labs.h13_generics;

import org.junit.jupiter.api.Test;

class MyCollectionTest {
    @Test
    void testCollection() {
        MyCollection c = new MyCollection();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        for (int i = 0; i < c.getLength(); i++) {
            System.out.println(c.get(i));
        }
    }
}
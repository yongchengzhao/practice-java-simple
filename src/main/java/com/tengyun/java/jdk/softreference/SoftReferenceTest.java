package com.tengyun.java.jdk.softreference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Adam Zhao
 */
public class SoftReferenceTest {
    public static void main(String[] args) {
        System.out.println("-----------SoftReferenceTest.main()---------------");

        List<SoftReference<Person>> personList = new ArrayList<>();
        var counter = 100000;
        for (int i = 0; i < counter; i++) {
            SoftReference<Person> per = new SoftReference<>(new Person("name" + i, i));
            personList.add(per);
        }

        System.out.println(personList.get(0).get());
        System.out.println(personList.get(1).get());
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;
}

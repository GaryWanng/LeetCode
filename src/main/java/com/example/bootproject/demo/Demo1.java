package com.example.bootproject.demo;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person userA = Person.builder().name("userA").age(100).build();
        Person userB = Person.builder().name("userB").age(10).build();
        Person userC = Person.builder().name("userC").age(11).build();
        Person userD = Person.builder().name("userD").age(13).build();
        Person userE = Person.builder().name("userE").age(140).build();
        Person userF = Person.builder().name("userF").age(17).build();
        persons.add(userA);
        persons.add(userB);
        persons.add(userC);
        persons.add(userD);
        persons.add(userE);
        persons.add(userF);
        List<Person> sortList = persons.stream()
                .filter(person -> !"userA".equals(person.getName()))
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .toList();
        System.out.println(JSON.toJSONString(sortList.get(0)));

    }
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Person{
    private String name;
    private int age;
}
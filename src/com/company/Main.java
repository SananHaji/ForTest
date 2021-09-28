package com.company;

import com.company.human.Student;
import com.company.human.StudentSortByAge;
import com.company.human.StudentSortByName;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        // write your code here
//        List<String> arr = new ArrayList<>();
//        Set<String> s = new HashSet<>();
//
//        arr.add("a");
//        arr.add("a");
//        arr.add("a");
//
//        s.add("s");
//        s.add("s");
//        s.add("s");
//
//        System.out.println("arr"+arr);
//        System.out.println("s"+s);

        //arr[a, a, a]
        //s[s]


//------------

        System.out.println(Utils.isCouple(5));

        Animal a = new Dog() {
            @Override
            String eat() {
                return null;
            }
        };
        Dog d = new Dog() {
            @Override
            String eat() {
                return null;
            }
        };

        Teddy li = new Teddy("zar");
        Teddy teddy = new Teddy("ar");
        List<Teddy> list = new ArrayList<>();

        list.add(li);
        list.add(teddy);
        System.out.println(list);
        Collections.sort(list, Teddy::compareTo);
        System.out.println(list);

        // scope
        if (true) {
            int i = 0;

        }


        d.run();

        a.breath();

        Integer i = Integer.valueOf("0");
        System.out.println(i.intValue());


        System.out.println("-----------------------");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(44, "tural"));
        students.add(new Student(25, "senan"));
        students.add(new Student(50, "ali"));
        System.out.print("before sort: ");
        System.out.println(students);

        Collections.sort(students);
        System.out.print("after sort: ");
        System.out.println(students);


        System.out.println("-----------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(3);
        System.out.print("before sort: ");
        System.out.println(list1);
        list1.sort(Collections.reverseOrder());
        System.out.print("after sort: ");
        System.out.println(list1);

        System.out.println("-----------------------");

        System.out.println("asd".compareTo("ac"));

        Student student1 = new Student(12, "Asdas");
        Student student2 = new Student(23, "sadsa");
        Student student3 = new Student(13, "badsa");

        System.out.println(student1.compareTo(student2));

        List<Student> studentArrayList = Arrays.asList(student1, student2, student3);

//        System.out.print("before sort: ");
//        System.out.println(studentArrayList);
//        Collections.sort(studentArrayList, new StudentSortByName());
//        System.out.print("after sort: ");
//        System.out.println(studentArrayList);

//        System.out.print("before sort: ");
//        System.out.println(studentArrayList);
//        Collections.sort(studentArrayList, new StudentSortByAge());
//        System.out.print("after sort: ");
//        System.out.println(studentArrayList);

        System.out.print("before sort: ");
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList, (o1, o2) -> o1.getAge()-o2.getAge());
        System.out.print("after sort: ");
        System.out.println(studentArrayList);

    }
}

package Structural.composite;


/*
* 组合模式 常用于 树形分支的结构中
* 如容器中
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        CollegeStudent students = new CollegeStudent();
        students.add(new ITStudent("wangzisfa", "2222"))
                .add(new CommunicationStudent("wzh", "1231"))
                .add(new CollegeStudent("user", "32942"));


        System.out.println(Arrays.toString(students.getList().toArray()));
    }
}

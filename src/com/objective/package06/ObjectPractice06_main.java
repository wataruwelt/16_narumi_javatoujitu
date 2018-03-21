package com.objective.package06;
import java.util.ArrayList;

public class ObjectPractice06_main {
    public static void main(String[] args) {
        ArrayList<ObjectPractice06> ObjectPractice06_array = new ArrayList<>();
        ObjectPractice06_array.add(new ObjectPractice06(500,1));
        ObjectPractice06_array.add(new ObjectPractice06(100,100));
        ObjectPractice06_array.add(new ObjectPractice06(50,100));
        ObjectPractice06_array.add(new ObjectPractice06(10,100));
        ObjectPractice06_array.add(new ObjectPractice06(5,100));
        ObjectPractice06_array.add(new ObjectPractice06(1,100));

        for(int i = 0; i < ObjectPractice06_array.size(); i++){
            ObjectPractice06_array.get(i).kadai();

//            System.out.println(sum);
//            System.out.println(getCount);
        }
    }
}

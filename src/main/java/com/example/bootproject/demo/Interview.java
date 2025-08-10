package com.example.bootproject.demo;


import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview {

    public static void main(String[] args) {

        String s = "FB";
        String s1 = "FoBa";
        String s2 = "FoBaT";

        System.out.println(JSON.toJSONString(judge(s)));
        System.out.println(JSON.toJSONString(judge(s1)));
        System.out.println(JSON.toJSONString(judge(s2)));
    }

    public static List<Boolean> judge(String s) {

        List<Boolean> result = new ArrayList<>();

        List<String> list = Arrays.asList("FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack");
        char[] charArray = s.toCharArray();

        ArrayList<Integer> upcases = new ArrayList<>();
        ArrayList<String> compare = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if ((int) charArray[i] < 97) {
                upcases.add(i);
            }
        }

        int j = 0;
        int[] array = upcases.stream().mapToInt(Integer::valueOf).toArray();
        for (int k = 0; k < array.length; k++) {
            String substring = s.substring(j, array[k]);
            compare.add(substring);
        }

        list.forEach(l -> {
            boolean b = true;
            for (String string : compare) {
                if (!l.contains(string)) {
                    b = false;
                    return;
                }
            }
            result.add(b);
        });


        return result;
    }

}

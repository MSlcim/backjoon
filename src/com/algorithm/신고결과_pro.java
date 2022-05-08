package com.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 신고결과_pro {
    public static void main(String[]args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "muzi frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idxMap = new HashMap<>();

        for (int i = 0; i <id_list.length ; i++){
            map.put(id_list[i],new HashSet<>());
            idxMap.put(id_list[i],i);
        }


            for (String s : report) {
                String[] str = s.split(" ");
                String from = str[0];
                String to = str[1];
                map.get(to).add(from);
            }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++; //idxMap.get(name)은 해당 ID의 index
                }
            }
        }
        System.out.println(answer[idxMap.get("muzi")]);
    }


}

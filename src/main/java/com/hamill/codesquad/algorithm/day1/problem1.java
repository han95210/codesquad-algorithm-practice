package com.hamill.codesquad.algorithm.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class problem1 {

    public String solution1(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int index = 0;
        for (String c: completion) {
            if (!c.equals(participant[index]))
                return participant[index];
            index++;
        }
        return participant[participant.length-1];
    }

    public String solution2(String[] participant, String[] completion) {

        String answer = "";

        //getOrDefault 를 넣어주지 않으면 중복 체크가 되지 않아요.
        //HashMap 의 put은 key가 존재하면 value 를 새로운 값으로 바꿔주니까요.
        //이미 등록된 동명이인이 있다면 hm.getOrDefault 로 인해서 2라는 값이 들어가겠네요

        List<String> list = new ArrayList<>();

        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            hm.put(player, hm.getOrDefault(player, 0) + 1);
            System.out.println(hm);
        }
        for (String player : completion) {
            hm.put(player, hm.get(player) - 1); //get(Object Key) 지정된 key의 값 반환
            System.out.println(hm);
        }

        for (String key : hm.keySet()) {        //keySet() hashmap에 저장된 모든 키가 저장된 set을 반환한다
            if (hm.get(key) != 0) {
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        problem1 prb = new problem1();
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"leo", "kiki"};
        System.out.println(prb.solution2(participant, completion));
    }
}

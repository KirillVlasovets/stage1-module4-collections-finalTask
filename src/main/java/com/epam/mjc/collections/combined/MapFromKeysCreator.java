package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> ans = new HashMap<>();
        List<String> numbersNames = new ArrayList<>(sourceMap.keySet());
        numbersNames.sort(Comparator.comparingInt(String::length));
        while (numbersNames.size() > 0) {
            Set<String> names = new HashSet<>();
            names.add(numbersNames.get(0));
            String name = numbersNames.remove(0);
            for (int i = 0; i < numbersNames.size(); i++) {
                if (numbersNames.get(i).length() == name.length()) {
                    names.add(numbersNames.get(i));
                    numbersNames.remove(i);
                    i--;
                }
            }
            ans.put(name.length(), names);
        }
        return ans;
    }
}

package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> allLessons = new HashSet<>();
        for (var lessons : timetable.values()) {
            allLessons.addAll(lessons);
        }
        return allLessons;
    }
}

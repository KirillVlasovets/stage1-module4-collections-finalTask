package com.epam.mjc.collections.combined;

import java.util.Comparator;

public class ProjectsComparator implements Comparator<String> {
    @Override
    public int compare(String proj1, String proj2) {
        if (proj1.length() != proj2.length()) {
            return proj2.length() - proj1.length();
        } else {
            return proj2.compareTo(proj1);
        }
    }
}

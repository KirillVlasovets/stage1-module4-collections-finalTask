package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devsProjects = new ArrayList<>();
        projects.keySet().forEach(project -> {
            if (projects.get(project).contains(developer)) {
                devsProjects.add(project);
            }
        });
        devsProjects.sort((s1, s2) -> new ProjectsComparator().compare(s1, s2));
        return devsProjects;
    }
}

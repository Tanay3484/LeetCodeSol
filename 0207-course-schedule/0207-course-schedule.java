import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preMap = new HashMap<>();

        // Initialize the map with empty lists
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }

        // Map each course to its prerequisite list
        for (int[] prereq : prerequisites) {
            int crs = prereq[0];
            int pre = prereq[1];
            preMap.get(crs).add(pre);
        }

        Set<Integer> visiting = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        // Perform DFS for each course
        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course, preMap, visiting, visited)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int course, Map<Integer, List<Integer>> preMap, Set<Integer> visiting, Set<Integer> visited) {
        if (visiting.contains(course)) {
            return false;
        }
        if (visited.contains(course)) {
            return true;
        }

        visiting.add(course);
        for (int pre : preMap.get(course)) {
            if (!dfs(pre, preMap, visiting, visited)) {
                return false;
            }
        }
        visiting.remove(course);
        visited.add(course);

        return true;
    }
}
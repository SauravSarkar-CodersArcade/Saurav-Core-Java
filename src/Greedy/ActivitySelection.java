package Greedy;

import java.util.*;

class Activity {
    int start, finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class ActivitySelection {
    
    // Comparator to sort activities by finish time
    static class ActivityComparator implements Comparator<Activity> {
        public int compare(Activity a1, Activity a2) {
            return a1.finish - a2.finish; // Sort in ascending order of finish time
        }
    }

    static void printMaxActivities(List<Activity> activities) {
        // Sort activities based on finish time
        activities.sort(new ActivityComparator());

        // First activity is always selected
        int lastSelected = 0; // Zero index
        System.out.print("(" + activities.get(lastSelected).start + ", " + activities.get(lastSelected).finish + ")");

        // Iterate through activities and select non-overlapping ones
        for (int i = 1; i < activities.size(); i++) {
            if (activities.get(i).start >= activities.get(lastSelected).finish) {
                System.out.print(" (" + activities.get(i).start + ", " + activities.get(i).finish + ")");
                lastSelected = i;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Activity> activities = Arrays.asList(
            new Activity(5, 7),
            new Activity(8, 9),
            new Activity(1, 4),
            new Activity(5, 9),
            new Activity(0, 6),
            new Activity(3, 5)
        );

        printMaxActivities(activities);
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class activityselection {

    static class Activity{
    int start;
    int finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] start={3,3,1,5};
        Integer[] finish={7,4,2,9};
        int n = start.length;
        Activity[] activities = new Activity[n];
        
        for(int i=0;i<n;i++){
            activities[i]=new Activity(start[i],finish[i]);
        }
        Arrays.sort(activities,(a,b)->a.finish-b.finish);
        List<Activity> selected=new ArrayList<>();
        selected.add(activities[0]);
        int lastfinish =activities[0].finish;
        for(int i=1;i<n;i++){
            if(activities[i].start>=lastfinish){
                selected.add(activities[i]);
                lastfinish=activities[i].finish;
            }
        }
        int totalActivities=selected.size();
        System.out.println("Total activities selected: "+totalActivities);
        for(Activity activity:selected){
            System.out.println("Start time: "+activity.start+" End time: "+activity.finish);
        }

    }
    
}

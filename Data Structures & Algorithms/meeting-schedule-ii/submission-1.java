/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        List<Interval> events = new ArrayList<>();
        for(Interval i : intervals){
            events.add(new Interval(i.start, 1));
            events.add(new Interval(i.end, -1));
        }

        Collections.sort(events, (a,b) -> {
            if(a.start == b.start)
                return a.end - b.end;
            return a.start - b.start;
        });

        

        int max = 0;
        int curr = 0;

        for(Interval it : events){
            curr+=it.end;
            if(curr > max){
                max = curr;
            }
        }

        return max;
    }
}

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class lt551 {
    public boolean checkRecord(String s) {
        int len = s.length();
        int count = 0;
        int last = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') count++;
            if (count >= 2) return false;
            if (c == 'L') {
                last++;
                if (last >= 3) return false;
            } else {
                last = 0;
            }

        }
        return true;

    }


}

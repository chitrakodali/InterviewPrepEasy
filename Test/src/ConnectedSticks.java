import java.util.PriorityQueue;

public class ConnectedSticks {
    public static int connectSticks(int[] sticks) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int stick : sticks)
            minHeap.add(stick);

        int minCost = 0;

        while(minHeap.size() > 1){
            int sum = minHeap.poll() + minHeap.poll();
            minCost += sum;
            minHeap.add(sum);
        }
        return minCost;

    }

    public static void main(String[] args){
        int[] n = {1,8,3,5};
        System.out.println(ConnectedSticks.connectSticks(n));
    }
}


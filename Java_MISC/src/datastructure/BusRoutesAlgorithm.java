package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * https://leetcode.com/problems/bus-routes/description/
 */
public class BusRoutesAlgorithm {

	public static void main(String[] args) {
		  int[][] routes= 
			  {{5,7,12},{4,5,12,15},{6,7,9},{5,15,19},{5,9,12,13}};
				//  , source = 15, target = 12;
			  //{{1,2,7},{3,6,7}};
		  int source = 5;
		  int target = 15;
		  
		  int result = numBusesToDestination(routes, source, target);
		  System.out.println(result);

	}
	
	public static int numBusesToDestination(int[][] routes, int S, int T) {
        if(S == T) return 0;
        // Create the graph
        Map<Integer, List<Integer>> g = new HashMap<>();
        for(int i = 0; i < routes.length; i++){
            for(int j = 0; j < routes[i].length; j++){
                List<Integer> buses = g.containsKey(routes[i][j]) ? g.get(routes[i][j]): new ArrayList<>();
                buses.add(i);
                g.put(routes[i][j], buses);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        int step = 0;
        boolean[] ride = new boolean[routes.length];
        while(!q.isEmpty()){
            int size = q.size();
            ++step;
            for(int i = 0; i < size; i++){
                int cur = q.poll();
                // for each bus stop, get all buses that can pass through this stop
                List<Integer> buses = g.get(cur);
                for(Integer bus : buses){
                    if(ride[bus]) continue;
                    ride[bus] = true;
                    // If never visited this bus before, add all stops of this bus to the queue.
                    for(Integer stop : routes[bus]){
                        if(stop == T) return step;
                        q.offer(stop);
                    }
                }
            }
        }
        return -1;
    }

}

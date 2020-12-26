
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ShortestDist {
	
	static ArrayList<Integer>[] list= new ArrayList[7];
	static int[] hvalue = new int[7];
	static HashMap<Integer,Integer>[] cost = new HashMap[7];
	public static void main(String args[]) {
		
		for(int i = 0; i<list.length; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i<cost.length; i++) {
			cost[i] = new HashMap<>();
		}

		addEdge(0,1,list);
		addEdge(0,2,list);
		addEdge(1,4,list);
		addEdge(1,5,list);
		addEdge(3,4,list);
		addEdge(2,4,list);
		addEdge(2,3,list);
		addEdge(4,6,list);
		addEdge(5,6,list);
		
		addHvalue(0,14);System.out.println("Naming \n a-0  \n b-1 \n c-2 \n d-3 \n e-4 \n f-5 \n z-6 ");
						System.out.println("Reached final state with following path : ");
		addHvalue(1,12);
		addHvalue(2,11);
		addHvalue(3,11);
		addHvalue(4,4);
		addHvalue(5,6);
		addHvalue(6,0);
		
		cost[0].put(1,4);
		cost[0].put(2,3);
		cost[1].put(5,5);
		cost[1].put(4,12);
		cost[2].put(4,10);
		cost[2].put(3,7);
		cost[5].put(6,16);
		cost[3].put(4,2);
		cost[4].put(6,5);
		
		bfs(0,6,cost);
		
		
	}
	public static void bfs(int i, int x, HashMap<Integer,Integer>[] cost) {
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		int visited[] = new int[7];
		int weight[]= new int[7];
		String path[] = new String[7];
		path[0]="0";
		queue.add(i);
		visited[i]=1;

		for(int ii =0; ii<7; ii++) {
			weight[ii] = Integer.MAX_VALUE;
		}

		while(!queue.isEmpty()) {
			int y = queue.remove();
			
			for(int k =0; k<list[y].size(); k++) {
				int z = list[y].get(k);
				
				if(weight[z]>cost[y].get(z)+hvalue[z]) {
					weight[z] = cost[y].get(z)+hvalue[z];
					path[z]=path[y]+z;				
				}
				
				if(visited[z]!=1) {				
					
					if(x==z) {						
						System.out.println(path[z]);						
					}
					visited[z]=1;
					queue.push(z);
					
				}
			}	
		}
		
	}

	public static void addHvalue(int i,int value){
		
		hvalue[i] = value;
	}
	public static void addEdge(int a, int b, ArrayList<Integer>[] list) {
		
		list[a].add(b);
		
	}
	
}
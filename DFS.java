import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
	
	static LinkedList<Integer>[] list= new LinkedList[7];
	static int[] hvalue = new int[7];
	static HashMap<Integer,Integer>[] cost = new HashMap[7];
	static String[] path = new String[7];
	public static void main(String args[]) {
		
		for(int i = 0; i<list.length; i++) {
			list[i] = new LinkedList<>();
		}
		for(int i = 0; i<cost.length; i++) {
			cost[i] = new HashMap<>();
		}
		addEdge(0, 1,list);
		addEdge(0,2,list);
		addEdge(1,3,list);
		addEdge(1,4,list);
		addEdge(2,4,list);
		addEdge(2,5,list);
		addEdge(3,6,list);
		addEdge(4,6,list);
		addEdge(5,4,list);
		
		addHvalue(0,14);
		addHvalue(1,12);
		addHvalue(2,11);
		addHvalue(3,11);
		addHvalue(4,4);
		addHvalue(5,6);
		addHvalue(6,0);
		
		cost[0].put(1,4);
		cost[0].put(2,3);
		cost[1].put(3,5);
		cost[1].put(4,12);
		cost[2].put(4,10);
		cost[2].put(5,7);
		cost[5].put(4,2);
		cost[3].put(6,16);
		cost[4].put(6,5);
		
		DFS();
		
		
	}
	static void DFS()
    {
       
        boolean visited[] = new boolean[7];
      
        int weight[] = new int[7];
        for(int ii=0; ii<7; ii++) {
        	weight[ii] = Integer.MAX_VALUE;
        }
        path[0]=""+0;
        dfs(0,6,cost,visited,weight);
        System.out.println(path[6]);
    }
	public static void dfs(int v, int x, HashMap<Integer,Integer>[] cost,boolean visited[],int weight[]) {
		
		if(v==x) {
			
			//System.out.println("reached ");
			return;
		}
		 
	       
	        
	        // Recur for all the vertices adjacent to this
	        // vertex
	        Iterator<Integer> i = list[v].listIterator();
	        while (i.hasNext()) 
	        {
	        	int z = i.next();
	        	
	        		
	        	if(weight[z]>cost[v].get(z)+hvalue[z]) {
					weight[z] = cost[v].get(z)+hvalue[z];
					path[z] = path[v]+z;
					//System.out.println(path[z]);
					
	        	}
	           
	            dfs(z,x,cost, visited,weight);
	        }
	    
		
	}
	
	public static void addCost(int a, int b, int cost) {
		
		
	}
	public static void addHvalue(int i,int value){
		
		hvalue[i] = value;
	}
	public static void addEdge(int a, int b, LinkedList<Integer>[] list) {
		
		list[a].add(b);
		
	}
	
}

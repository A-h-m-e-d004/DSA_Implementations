package DSA;

import java.util.ArrayList;
import java.util.List;

public class GraphData {
	int v;
	List<List<Integer>> lists;

	public GraphData(int v){
		this.v = v;
		lists = new ArrayList<>();
		for (int i = 0; i < v; i++) {
			lists.add(new ArrayList<>());
		}

	}

	public void dfs(int node, boolean[] visited, List<List<Integer>> lists){
		visited[node] = true;
		System.out.print(node + " ");

		for (int neighbor : lists.get(node)){
			if (!visited[neighbor]){
				dfs(neighbor, visited, lists);
			}
		}
	}

	public void showDfs(){
		lists.get(0).add(1);
		lists.get(0).add(2);
		lists.get(1).add(0);
		lists.get(1).add(3);
		lists.get(2).add(0);
		lists.get(3).add(1);

		boolean[] visited = new boolean[v];
		dfs(0, visited, lists);
	}
}

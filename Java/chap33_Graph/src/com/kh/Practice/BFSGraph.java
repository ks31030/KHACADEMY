package com.kh.Practice;

import com.kh.BFS.Graph;

public class BFSGraph {
	
	public static void main(String[] args) {
		//Graph 생성
		Graph g = new Graph(7);
		//간선 추가
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,4);
		g.addEdge(1,5);
		g.addEdge(2,3);
		g.addEdge(2,6);
		System.out.println("BFS 탐색 결과 : ");
		//BFS 시작 노드 0에서 호출해서 실행.
		g.BFS(0);
		System.out.println("==========");
		g.BFS(1);
		System.out.println("==========");
		g.BFS(2);
		System.out.println("==========");
		g.BFS(3);
		System.out.println("==========");
		g.BFS(4);
		System.out.println("==========");
		g.BFS(5);
		System.out.println("==========");
		g.BFS(6);
		System.out.println("==========");
	}

}

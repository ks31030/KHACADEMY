package com.kh.Practice;

import com.kh.BFS.Graph;

public class BFSGraph {
	
	public static void main(String[] args) {
		//Graph ����
		Graph g = new Graph(7);
		//���� �߰�
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,4);
		g.addEdge(1,5);
		g.addEdge(2,3);
		g.addEdge(2,6);
		System.out.println("BFS Ž�� ��� : ");
		//BFS ���� ��� 0���� ȣ���ؼ� ����.
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

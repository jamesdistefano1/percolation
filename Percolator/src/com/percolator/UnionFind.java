package com.percolator;

public class UnionFind {
	private int[] id;
	private int[] size;
	public UnionFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) id[i] = i;
		size = new int[N];
		for(int i = 0; i < N; i++) size[i] = 1;
	}
	private int root(int i)
	{
		while (i != id[i]) i = id[i];
		return i;
	}
	
	public void union(int p, int q)
	{
		 int i = root(p);
		 int j = root(q);
		 if (i == j) return;
		 if (size[i] < size[j]) {
			 id[i] = j; 
			 size[j] += size[i]; 
		 }
		 else { 
			 id[j] = i; 
			 size[i] += size[j]; 
		 } 
	}
	public Object find(int i) {
		// TODO Auto-generated method stub
		return id[i];
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumAlgoritma.Jobsheet15;

import PraktikumAlgoritma.Jobsheet15.Graph.DoubleLinkedList;

/**
 *
 * @author USER
 */
public class Graph {
    int vertex;
    DoubleLinkedList list[];
    Node right;
    
    public Graph(int vertex){
        this.vertex = vertex;
        list = new DoubleLinkedList[vertex];
        for(int i=0; i < vertex; i++){
            list[i] = new DoubleLinkedList();
        }
    }
    
    public void addEdge(int source, int destination){
        //dari
        list[source].addFirst(destination);
        //ke
        list[destination].addFirst(source);
    }
    
    public void degree(int source) throws Exception{
        //undirected
        System.out.println(" degree vertex " + source + " " + list[source].size());
        //directed
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j)==source){
                    ++totalIn;
                }
            }
        }
        //out
        for(k = 0; k < list[source].size(); k++){
            list[source].get(k);
        }
        totalOut = k;
        System.out.println("Indegree " + source+" = " + totalIn);
        System.out.println("Outdegree" + source+" = " + totalOut);
        System.out.println("Degree" + source+" = " + (totalIn+totalOut));
    }
    
    public void removeEdge(int source, int destination) throws Exception{
        for(int i = 0; i < vertex; i++){
            if(i==destination){
                list[source].remove(destination);
            }
        }
    }
    
    public void removeAllEdge(){
        for(int i = 0; i < vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph sudah kosong");
    }
    
    public void printGraph() throws Exception{
        for(int i = 0; i < vertex; i++){
            if(list[i].size()>0){
                System.out.println("vertex "+i+" terhubung ke ");
                for(int j=0; j < list[i].size(); j++){
                    System.out.println(list[i].get(j) + " ");
                }
                System.out.println(" ");
            }
        }
        System.out.print(" ");
    }
    
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
    }
   
}

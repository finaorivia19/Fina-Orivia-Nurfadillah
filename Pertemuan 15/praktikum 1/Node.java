/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumAlgoritma.Jobsheet15;

/**
 *
 * @author USER
 */
public class Node {

    /**
     * @param args the command line arguments
     */
    int data;
    Node prev, next;
    
    Node(Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
    


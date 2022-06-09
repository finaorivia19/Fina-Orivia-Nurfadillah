/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Node;

/**
 *
 * @author USER
 */
public class Node {
    int data;
    Node left, right;
    
public Node(){
    
    }
    
public Node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }

boolean isLeaf() {
  return left == null && right  == null;     
    //To change body of generated methods, choose Tools | Templates.
    }
    }
    


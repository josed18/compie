/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author nestyko
 */
public class BstMathComponent extends BST_math {
    String inputString= new String();
    String ecuacion_completa;
    int totalnodes = 0; //keeps track of the inorder number for horiz. scaling 
    int maxheight=0;//keeps track of the depth of the tree for vert. scaling

    public BstMathComponent(String ecuacion) {
        super(ecuacion);
        this.ecuacion_completa = ecuacion;
    }

    public int treeHeight(ntt t){
	if(t==null) return -1;
          else return 1 + max(treeHeight(t.left),treeHeight(t.right));
    }
    public int max(int a, int b){
	  if(a>b) return a; else return b;
    }

    public void computeNodePositions() {
      int depth = 1;
      inorder_traversal(root, depth);
    }

//traverses tree and computes x,y position of each node, stores it in the node

    public void inorder_traversal(ntt t, int depth) { 
      if (t != null) {
        inorder_traversal(t.left, depth + 1); //add 1 to depth (y coordinate) 
        t.xpos = totalnodes++; //x coord is node number in inorder traversal
        t.ypos = depth; // mark y coord as depth
        inorder_traversal(t.right, depth + 1);
      }
}

/* below is standard Binary Search tree insert code, creates the tree */

    public ntt insert(ntt root, String s) { // Binary Search tree insert
      if (root == null) {
        root = new ntt(s, null, null);
        return root;
      }
      else {
        if (s.compareTo((String)(root.data)) == 0) {
           return root;  /* duplicate word  found - do nothing */
        } else   if (s.compareTo((String)(root.data)) < 0)
                     root.left = insert(root.left, s);
                 else
                     root.right = insert(root.right, s);
        return root;
      }
    }
  }

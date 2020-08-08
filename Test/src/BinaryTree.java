import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;
     class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    public boolean search(Node root, int key){
        if (root == null)
            return false;
        if (root.key == key)
            return true;

        if (key < root.key)
            return search(root.left, key);
        if (key > root.key)
            return search(root.right,key);
        return false;
    }

    public boolean searchTree(int key){
        return search(root,key);
    }
    int sum(Node root){

        int sumNodes = 0;
        if (root != null){
            int leftSum = sum(root.left);
            int rtSum = sum(root.right);
            sumNodes = root.key + rtSum + leftSum;
        }

        //System.out.println( sumNodes);
        return sumNodes;
    }
    int sumAtEachLevel(Node root, Node left, Node right) {
        int sumAtEach = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        queue.offer(null);

         return 0;
    }

      int maxLevel(Node root){
         if (root == null)
             return 0;
         else
         return (1+ Math.max(maxLevel(root.left),maxLevel(root.right)));
    }

    static void maxLevelSum(Node root, int max_level,
                            int sum[], int current)
    {

        if (root == null)
            return;


        sum[current] += root.key;

        // Recursive call for the left child
        maxLevelSum(root.left, max_level, sum,
                current + 1);

        // Recursive call for the right child
        maxLevelSum(root.right, max_level, sum,
                current + 1);
    }

    // Function to find the maximum sum of a
// level in the tree using recursion
    int maxLevelSum( Node root)
    {

        // Maximum levels in the given tree
        int max_level = maxLevel(root);

        // To store the sum of every level
        int sum[] = new int[max_level + 1];

        // Recursive function call to
        // update the sum[] array
        maxLevelSum(root, max_level, sum, 1);

        // To store the maximum sum for a level
        int maxSum = 0;

        // For every level of the tree, update
        // the maximum sum of a level so far
        System.out.println(Arrays.toString(sum));
        for (int i = 1; i <= max_level; i++)
            maxSum = Math.max(maxSum, sum[i]);

        // Return the maximum sum
        return maxSum;
    }
    public  Node insertNode(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertNode(root.left,key);
        }
        if (key > root.key) {
            root.right = insertNode(root.right, key);
        }
        return root;
   }


   void inOrderTree(Node root){
        if (root != null){
            inOrderTree(root.left);
            System.out.println(root.key);
            inOrderTree(root.right);
        }

   }
   Node add(int key){
        root = insertNode(root,key);
        return root;
   }
   void inOrder(Node root){
        inOrderTree(root);
   }
   public static void main(String[] args){
        BinaryTree bst = new BinaryTree();

         bst.add(1);
        bst.add(3);
        bst.add(9);
        bst.add(7);
        bst.add(1);
        bst.add(4);
        bst.add(11);


       //bst.inOrder(bst.root);

       //System.out.println(bst.searchTree(35));

     // System.out.println(bst.sum(bst.root));
      System.out.println(bst.maxLevel(bst.root));
      System.out.println(bst.maxLevelSum(bst.root));
   }


}

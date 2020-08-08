public class FindMaxPathBT {

        Node root;
        int globalMax;
    class Node
    {
        int val;
        Node left, right;

        public Node(int item)
        {
            val = item;
            left = right = null;
        }
    }

        FindMaxPathBT(){
		/*
		        3
		       / \
		      2   20
		     /   /  \
		    7   5   -8

		*/
            root = new Node(3);

            // Creating 2nd level:
            Node one = new Node(2);
            Node two = new Node(20);
            root.left = one;
            root.right = two;

            // Creating 3rd level:
            Node three = new Node(7);
            Node four = new Node(5);
            Node five = new Node(-8);
            one.left = three;
            two.left = four;
            two.right = five;
        }
        int findMaxPath(Node root){
            if(root == null)
                return 0;

            // recursive calls:
            int left = findMaxPath(root.left);
            int right = findMaxPath(root.right);

            // Max of first three cases:
            int returnMax = Math.max(Math.max(left, right) + root.val, root.val);

            // Max of all four cases:
            int max = Math.max(returnMax, root.val + left + right);

            // Update globalMax:
            if(max > globalMax)
                globalMax = max;

            // Return value to parent caller:
            return returnMax;
        }

        public static void main(String[] args) {
            FindMaxPathBT m = new FindMaxPathBT();
            m.findMaxPath(m.root);

            System.out.println("Maximum possible sum in a path: " + m.globalMax);
        }
    }



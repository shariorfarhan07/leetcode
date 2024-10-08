package trees;

// Java Program to print binary tree in 2D
class GFG {

    static final int COUNT = 10;

        // Function to print binary tree in 2D
    // It does reverse inorder traversal
    static void print2DUtil(Node root, int space)
    {
        // Base case

        // Increase distance between levels
        space += COUNT;
        if (root == null){
            for (int i = COUNT; i < space; i++)
                System.out.print(" ");
        System.out.print("Null\n");return;}


        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        // Process left child
        print2DUtil(root.left, space);
    };

    // Wrapper over print2DUtil()
    static void print2D(Node root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }

    // Driver code
    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = null;
        root.right.right.right = new Node(15);

        print2D(root);
    }

// A binary tree node
    static class Node {
        int data;
        Node left, right;

        /* Constructor that allocates a new node with the
        given data and null left and right pointers. */
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
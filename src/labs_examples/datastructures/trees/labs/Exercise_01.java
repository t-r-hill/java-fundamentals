package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST
        2.) Insert new elements
        3.) Retrieve elements
        4.) Update elements
        5.) Delete elements
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal)
        7.) Keep the tree well balanced

 */
class Exercise_01{

    public static void main(String[] args) {
        BST<String> bst = new BST<>();

        bst.insert(4, "four");
        bst.insert(3, "two");
        bst.insert(2, "one");
        bst.insert(1, "three");
        bst.insert(7, "seven");
        bst.insert(5, "five");
        bst.insert(8, "eight");

        System.out.println("Print in order:");
        bst.printInOrder(bst.root);

        System.out.println("Print pre order:");
        bst.printPreOrder(bst.root);
    }
}


class BST<T>{
    Node<T> root;

    public void insert(int key, T data){
        if (root == null){
            root = new Node<T>(key, data);
        } else{
            insert(key, data, root);
        }
    }

    public Node<T> insert(int key, T data, Node<T> node){
            if (node == null){
                node = new Node<T>(key, data);
            }

            if (key < node.key){
                node.left = insert(key, data, node.left);
            }

            if (key > node.key){
                node.right = insert(key, data, node.right);
            }

            return node;
    }

    public void insertIteratively(int key, T data){
        if (root == null){
            root = new Node(key, data);
        } else{
            Node<T> node = root;
            Node<T> pnode = null;

            while (node != null){
                pnode = node;
                if (key < node.key){
                    node = node.left;
                } else if (key > node.key){
                    node = node.right;
                }
            }

            if (key < pnode.key){
                pnode.left = new Node(key, data);
            }

            if (key > pnode.key){
                pnode.right = new Node(key, data);
            }
        }
    }

    private Node<T> getNode(int key){
        Node<T> node = root;

        while (node.key != key){
            if (key < node.key){
                node = node.left;
            } else if (key > node.key){
                node = node.right;
            }
        }

        return node;
    }

    public T get(int key){
        return getNode(key).data;
    }

    public void update(int key, T data){
        getNode(key).data = data;
    }

    public void remove(int key){
        Node<T> node = getNode(key);

        if (node.left == null & node.right == null){
            node = null;
        } else if (node.left == null){
            node = node.right;
        } else if (node.right == null){
            node = node.left;
        } else{
            Node<T> smallest = node.right;
            while (smallest.left != null){
                smallest = smallest.left;
            }
            node.key = smallest.key;
            node.data = smallest.data;
        }
    }

    void rotateRight(Node<T> node){
        Node<T> left = node.left;
        Node<T> rightChild = left.right;

        left.right = node;
        node.left = rightChild;
        node = left;
    }

    public void printInOrder(Node<T> root){
        String output = "";
        Node<T> node = root;
        if (node == null){
            return;
        } else {
            printInOrder(node.left);
            System.out.println(node.toString());
            printInOrder(node.right);
        }
    }

    public void printPreOrder(Node<T> root){
        String output = "";
        Node<T> node = root;
        if (node == null){
            return;
        } else{
            printPreOrder(node.left);
            printPreOrder(node.right);
            System.out.println(node.toString());
        }
    }
}

class Node<T>{
    int key;
    T data;
    Node<T> left;
    Node<T> right;

    Node(int key, T data){
        this.key = key;
        this.data = data;
    }

    public String toString(){
        return "( " + key + ", " + data + ")";
    }
}
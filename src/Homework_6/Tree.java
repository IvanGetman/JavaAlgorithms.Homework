package Homework_6;

import Homework_4.Person;

public class Tree {
    private Node root;

    public Tree() {
    }

    public Node find(int key) {
        Node current = root;
        while (current.person.id != key) {
            if (key < current.person.id) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }

    public void insert(Person person) {
        Node node = new Node(person);
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            while (true) {
                Node parent = current;
                if (person.id < current.person.id) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = node;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = node;
                        return;
                    }
                }
            }
        }
    }

    public void inOrder(Node nodeRoot) {
        if (nodeRoot != null) {
            inOrder(nodeRoot.leftChild);
            nodeRoot.display();
            inOrder(nodeRoot.rightChild);
        }
    }

    public void preOrder(Node nodeRoot) {
        if (nodeRoot != null) {
            nodeRoot.display();
            preOrder(nodeRoot.leftChild);
            preOrder(nodeRoot.rightChild);
        }
    }

    public void postOrder(Node nodeRoot) {
        if (nodeRoot != null) {
            postOrder(nodeRoot.leftChild);
            postOrder(nodeRoot.rightChild);
            nodeRoot.display();
        }
    }

    public Node showMin() {
        Node current = root;
        Node min = null;
        while (current != null) {
            min = current;
            current = current.leftChild;
        }
        return min;
    }

    public Node showMax() {
        Node current = root;
        Node max = null;
        while (current != null) {
            max = current;
            current = current.rightChild;
        }
        return max;
    }

    public boolean delete(int id) {
        Node current = root;
        Node parent = root;

        boolean isLeftChild = true;

        while (current.person.id != id) {
            parent = current;
            if (id < current.person.id) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {
                return false;
            }
        }

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        } else if (current.rightChild == null) {
            if (current == null) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else if (current.leftChild == null) {
            if (current == null) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
        }
        return true;
    }

    public Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }
        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }
        return successor;
    }

    public void displayTree() {
        Node current = root;
        System.out.println("Симметричный порядок:");
        inOrder(current);
        System.out.println("Прямой порядок:");
        preOrder(current);
        System.out.println("Обратный порядок:");
        postOrder(current);
    }
}

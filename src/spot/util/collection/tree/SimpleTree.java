package spot.util.collection.tree;

import java.util.ArrayList;
import java.util.List;

public class SimpleTree<T> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public SimpleTree(T rootData) {
        root = new Node<T>(rootData, null);
    }

    public static class Node<T> {
        private T data;
        private Node<T> parent;
        private List<Node<T>> children;
        
        public Node(T _data, Node<T> _parent) {
            data = _data;
            parent = _parent;
            children = new ArrayList<Node<T>>();
        }
        
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getParent() {
            return parent;
        }

        public void setParent(Node<T> parent) {
            this.parent = parent;
        }

        public List<Node<T>> getChildren() {
            return children;
        }

        public void addChild(Node<T> child) {
            children.add(child);
        }
    }
}

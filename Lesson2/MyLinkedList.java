package Lesson2;

public class MyLinkedList <E>{

    private Node<E> firstNode;
    private Node<E> lastNode;
    private  int size = 0;

    public MyLinkedList(){
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }

    public void addElementAtLast(E element){
        Node<E> previous = lastNode;
        previous.setCurrentElement(element);
        lastNode = new Node<E>(null, previous, null);
        previous.setNextElement(lastNode);
        size++;
    }

    public void addElementAtFirst(E element){
        Node<E> next = firstNode;
        next.setCurrentElement(element);
        firstNode = new Node<>(null,null, next);
        next.setPreviousElement(firstNode);
        size++;
    }

    public E getElementByIndex(int index){
        Node<E> result = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            result = getNext(result);
        }
        return result.getCurrentElement();
    }

    private Node<E> getNext(Node<E> current){
        return current.getNextElement();
    }

    public int size(){
        return size;
    }


    private class Node<E>{

        private E currentElement;
        private Node<E> nextElement;
        private Node<E> previousElement;

        private Node(E currentElement, Node<E> previousElement, Node<E> nextElement){
            this.currentElement = currentElement;
            this.previousElement = previousElement;
            this.nextElement = nextElement;
        }

        public E getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<E> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<E> getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Node<E> previousElement) {
            this.previousElement = previousElement;
        }
    }

}

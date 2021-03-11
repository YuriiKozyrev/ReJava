package Lesson2;

public class MyIntegerArrayList {
    private int [] elements;
    private int size;

    public MyIntegerArrayList(){
        int startCapacity = 10;
        this.elements = new int[startCapacity];
    }

    public int [] increaseCapacity(){
        int [] temp = new int[elements.length * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }

    public boolean add(int value){
        if (size == elements.length){
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    public void set(int value, int index){
        elements[index] = value;
    }

    public void remove (int index){
        int [] temp = elements;
        elements = new int[temp.length - 1];
        System.arraycopy(temp,0, elements,0,index);
        System.arraycopy(temp,index + 1, elements, index, temp.length - index - 1);
        size--;
    }

    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
    }
}

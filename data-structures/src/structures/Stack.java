package structures;

@SuppressWarnings("unchecked")
public class Stack<T> {
    
    private T vector[];
    private int size;

    public Stack(int amount) {
        this.vector = (T[]) new Object[amount];
        this.size = 0;
    }

    public void push(T element) {
        increaseCapacity();
        if (size < vector.length) {
            vector[size] = element;
            size++;
        } else {
            throw new RuntimeException("error adding element out of vector bounds");
        }
    }

    public T peek(){
        if(isEmpty()){ return null; }
        return vector[size - 1];
    }

    public T pop(){
        if(isEmpty()){ return null; }
        return vector[--size];
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public int getSize() {
        return size;
    }
    //auxiliar methods
    public void increaseCapacity(){
        if(size == vector.length){
            T newVector[] = (T[]) new Object[size + 1];
            for(int i = 0; i < vector.length; i++){
                newVector[i] = vector[i];
            }
            vector = newVector;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i < size-1; i++){
            sb.append(vector[i]);
            sb.append(", ");
        }

        if(size > 0){
            sb.append(vector[size-1]);
            sb.append("]");
        }

        return sb.toString();
    }

}

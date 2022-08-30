package structures;

@SuppressWarnings("unchecked")
public class List<T> {
    
    private T vector[];
    private int size;

    public List(int amount) {

        this.vector = (T[]) new Object[amount];
        this.size = 0;
    }

    public void add(T element) {
        increaseCapacity();
        if (size < vector.length) {
            vector[size] = element;
            size++;
        } else {
            throw new RuntimeException("error adding element out of vector bounds");
        }
    }

    public void add(int position, T element){
        if (!(position < size && position >= 0)) {
            throw new IllegalArgumentException("element out of vector range");
        }

        increaseCapacity();

        for(int i = size; i > position; i--){
            vector[i] = vector[i-1];
        }
        vector[position] = element;
    }

    public void remove(int position){
        if (!(position < size && position >= 0)) {
            throw new IllegalArgumentException("element out of vector range");
        }

        for(int i = position; i < size-1; i++){
            vector[i] = vector[i+1];
        }

        size--;

    }

    public T getAt(int position) {
        if (position < size && position >= 0) {
            return vector[position];
        }
        throw new IllegalArgumentException("element out of vector range");
    }

    public int search(T element){
        for(int i = 0; i < size; i++){
            if(vector[i].equals(element)) { return i; }
        }
        
        return -1;
    }

    public int getSize() {
        return size;
    }

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
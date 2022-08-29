package structures;

public class Vector {
    
    private Integer vector[];
    private int size;

    public Vector(int amount){
        this.vector = new Integer[amount];
        this.size = 0;
    }

    //add element at the end of the vector
    public void add(int number){
        if(size < vector.length){
            vector[size] = number;
            size++;
        } else {
            throw new RuntimeException("error adding element out of vector bounds");
        }
    }

    //return the real size of vector
    public int getSize() {
        return size;
    }

}

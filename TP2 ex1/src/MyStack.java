public class MyStack {
    private int[] stack;
    private int capacity;
    private int size;
    public MyStack(int capacity){
        this.capacity=capacity;
        stack=new int[capacity];
        this.size=0;
    }
    public void AddElement(int x) throws StackFullException{
        if (this.StackIsFull()) {
            throw new StackFullException();
        }
        else{
            stack[size] = x;
            size++;
        }
    }
    public void RemoveElement() throws EmptyStackException{
        if (this.StackIsEmpty()){
            throw new EmptyStackException();
        }
        else{
            size--;
        }
    }
    int LastInStack(){
        return stack[size-1];
    }
    boolean StackIsEmpty(){
        return size==0;
    }
    boolean StackIsFull(){
        return size==capacity;
    }
    public String toString(){
        String res="[";
        for (int i=0;i<size-1;i++){
            res+=stack[i]+",";
        }
        return res+stack[size-1]+']';
    }
}

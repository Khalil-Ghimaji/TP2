class main{
    public static void main(String[] args) throws StackFullException, EmptyStackException {
        MyStack S = new MyStack(10);
        S.AddElement(10);
        S.AddElement(8);
        S.AddElement(5);
        S.RemoveElement();
        System.out.println(S.LastInStack());
    }
}
public class Stack {
    private int[] arr;
    private int n;
    private int m;
    public Stack(int n){
        this.arr = new int[n];
        this.n = n;
        this.m = 0;
    }
    public void put(int a){
        if(m == n){
            return;
        }
        arr[m++] = a;
    }
    public int get(){
        if(m == 0){
            return -9999;
        }
        return arr[--m];
    }
    public void soutArr(){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.put(1);
        stack.put(2);
        stack.put(3);
        stack.put(4);
        stack.put(5);
        stack.put(6);

        System.out.println(stack.get());
        System.out.println(stack.get());
        System.out.println(stack.get());
        System.out.println(stack.get());
        System.out.println(stack.get());
        System.out.println(stack.get());
        System.out.println(stack.get());
    }
}

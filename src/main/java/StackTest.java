public class StackTest {
    private int maxIndex = 4;
    private int[] arr = new int[5];
    private int nextReadIndex = -1;
    private int nextWriteIndex = 0;

    public void put(int a){
        if(nextWriteIndex > maxIndex){
            return;
        }
        arr[nextWriteIndex] = a;
        nextWriteIndex++;
        nextReadIndex++;
    }

    public int get(){
        if(nextReadIndex < 0){
            return -999;
        }
        int returnInt = arr[nextReadIndex];
        arr[nextReadIndex] = 0;
        nextReadIndex--;
        nextWriteIndex--;
        return returnInt;
    }

    public void soutArr(){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.put(1);
        stackTest.put(2);
        stackTest.put(3);
        stackTest.put(4);
        stackTest.put(5);
        stackTest.put(6);
        //stackTest.soutArr();
        System.out.println(stackTest.get());
        System.out.println(stackTest.get());
        System.out.println(stackTest.get());
        System.out.println(stackTest.get());
        System.out.println(stackTest.get());
        System.out.println(stackTest.get());
    }
}

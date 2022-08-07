import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<MyObject, String> hashMap = new HashMap();
        MyObject myObject1 = new MyObject(1);
        MyObject myObject2 = new MyObject(1);
        hashMap.put(myObject1, "myObject1");
        hashMap.put(myObject2, "myObject2");

        System.out.println(hashMap.get(myObject1));
        System.out.println(hashMap.get(myObject2));
    }
}

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        /*ConcurrentHashMap hashMap = new ConcurrentHashMap();
        hashMap.put(1, "b");

        System.out.println(hashMap.get(1));
        //hashMap.remove(1, "b");
        //hashMap.replace(1, "c");
        hashMap.replace(1, "c", "d");
        System.out.println(hashMap.get(1));*/
        //Person0803 p = new Person0803();
        /*HashMapChild hashMapChild = new HashMapChild();
        System.out.println(hashMapChild.get("1"));
        System.out.println(hashMapChild.get("2"));
        System.out.println(hashMapChild.get("3"));*/
        //System.out.println(HashMap.class.getName());
        System.out.println("asdnflasfasdf");
        System.out.println("hot-fix 2");
        System.out.println("hot-fix 4");
        System.out.println("hot-fix 3");
    }
}
class HashMapChild extends HashMap{
    {
        put("1", "a");
        put("2", "b");
        put("3", "c");
    }
}
class Person0803{

    public Person0803(){
        System.out.println("构造函数");
    }
    {
        System.out.println("构造代码块");
    }
}
/*class Person0722 {

    final int a;

    final Person0722 person0722;

    public Person0722(int a, Person0722 person0722){

        this.a = a;
        this.person0722 = person0722;
    }
}*/

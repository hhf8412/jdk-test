import java.util.Objects;

public class MyObject {
    private int num;
    public MyObject(int num){
        this.num = num;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return num == myObject.num;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}

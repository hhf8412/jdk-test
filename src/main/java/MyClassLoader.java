public class MyClassLoader extends ClassLoader{

    private ClassLoader parent;

    public MyClassLoader(ClassLoader parent){
        this.parent = parent;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        return super.findClass(name);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader classLoader = new MyClassLoader(MyClassLoader.class.getClassLoader());
        Class<?> test = classLoader.loadClass("Test");

        System.out.println(test.getClassLoader());
    }
}

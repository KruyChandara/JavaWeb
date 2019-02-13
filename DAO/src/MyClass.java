public class MyClass {
    public static void main(String[] args) {
        SingleTonClass s = SingleTonClass.getInstance();
        System.out.println(s.getNmae());
    }
}

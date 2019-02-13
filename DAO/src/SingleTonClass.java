public class SingleTonClass {
    private String name;
    private static SingleTonClass s = new SingleTonClass("Dara");
    private SingleTonClass(String name){
        System.out.println("Inside Constructor");
        this.name = name;
    }
    private void testing(){
        System.out.println("===========");
    }
    public static SingleTonClass getInstance(){
        return s;
    }
    public String getNmae(){
        return this.name;
    }

    public static void main(String[] args) {
        s.testing();
        System.out.println(s.name);
    }
}

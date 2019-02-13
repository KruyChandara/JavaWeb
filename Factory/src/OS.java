interface OS {
    public abstract void spec();
}
class Android implements OS {
    @Override
    public void spec(){
        System.out.println("Andriod");
    }
}
class IOS implements OS {
    @Override
    public void spec(){
        System.out.println("IOS");
    }
}
class Wndows implements OS {
    @Override
    public void spec(){
        System.out.println("Windows");
    }
}
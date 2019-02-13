public class MainClass {

    public static void main(String[] args) {
        OS andriod = OSFactory.getInstance("android");
        OS ios = OSFactory.getInstance("ios");
        OS windows = OSFactory.getInstance("windows");
        try {
            andriod.spec();
            ios.spec();
            windows.spec();
        }catch (NullPointerException n){
            System.out.println(n.getMessage());
        }


    }
}

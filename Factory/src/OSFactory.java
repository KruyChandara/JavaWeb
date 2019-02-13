public class OSFactory {

    public static OS getInstance(String osName){

        switch (osName){
            case "ios":
                return new IOS();
            case "windows":
                return new Wndows();
            case "android":
                return new Android();
            default:
                return null;
        }
    }
}

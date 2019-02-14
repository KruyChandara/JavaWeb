public class Facade {
    public static void startComputer(){
        StartCPU  o = new StartCPU();
        StartScreen o2 = new StartScreen();
        o.startCPU();
        o2.startScreen();
    }
}

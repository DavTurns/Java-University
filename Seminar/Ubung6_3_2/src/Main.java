public class Main {
    public static void main(String[] args) {
        VGAMonitor vgaMonitor = new VGAMonitor();
        HDMIMonitor hdmiMonitor = new HDMIMonitor();

        VGAToHDMIAdapter vgaToHDMIAdapter = new VGAToHDMIAdapter(hdmiMonitor);

        Computer computer = new Computer(vgaToHDMIAdapter);
        computer.display();
    }
}
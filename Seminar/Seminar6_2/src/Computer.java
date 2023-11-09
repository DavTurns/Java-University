public class Computer {
    private VGAPort vgaPort;

    public Computer(VGAPort vgaPort) {
    }

    public void display(){
        vgaPort.connectVGA();
    }

}

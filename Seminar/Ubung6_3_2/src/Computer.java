public class Computer {

    private VGAPort vgaPort;

    public Computer(VGAPort vgaPort) {
        this.vgaPort = vgaPort;
    }

    public void display() {
        vgaPort.connectVGA();
    }
}

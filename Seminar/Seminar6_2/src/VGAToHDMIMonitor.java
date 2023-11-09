public class VGAToHDMIMonitor implements VGAPort{

    private HDMIPort hdmiPort;

    public VGAToHDMIMonitor(HDMIPort hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    @Override
    public void connectVGA() {
        hdmiPort.connectHDMI();
    }
}

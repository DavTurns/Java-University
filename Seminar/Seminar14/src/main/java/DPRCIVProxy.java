public class DPRCIVProxy implements Police {

    private DPRCIV dprciv = new DPRCIV();

    @Override
    public void registerPlate(String plateNumber){

        if(plateNumber.contains("xxx")){
            throw new RuntimeException("Plate number should not be used");
        }
        dprciv.registerPlate(plateNumber);
    }

}

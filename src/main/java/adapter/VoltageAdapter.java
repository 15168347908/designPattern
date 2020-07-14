package adapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int voltage = output220V();
        return voltage / 44;
    }
}

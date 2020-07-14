package adapter;

public class Phone {

    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压正常，可以充电");
        }else if(voltage5V.output5V() > 5){
            System.out.println("电压过大，不可充电");
        }
    }
}

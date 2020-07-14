package bridge;

import adapter.Phone;

public class Client {
    public static void main(String[] args) {
        AbstractPhone phone = new SlidePhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
    }
}

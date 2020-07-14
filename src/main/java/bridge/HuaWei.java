package bridge;

public class HuaWei implements Brand {
    @Override
    public void open() {
        System.out.println("打开华为手机");
    }

    @Override
    public void call() {
        System.out.println("用华为手机打电话");
    }

    @Override
    public void close() {
        System.out.println("关闭华为手机");
    }
}

package bridge;

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("打开小米手机");
    }

    @Override
    public void call() {
        System.out.println("使用小米打电话");
    }

    @Override
    public void close() {
        System.out.println("关闭小米手机");
    }
}

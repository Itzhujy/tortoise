public class Rabbit extends Animal {
    public Rabbit() {
        super(2); // 设置兔子速度为2
    }

    @Override
    public void run() {
        while (!isFinished()) {
            move();
            try {
                sleep(50); // 休眠一段时间以模拟动物的移动速度
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

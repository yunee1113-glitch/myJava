abstract class Rabbit5 {
    int xPos;
    int yPos;

    public Rabbit5() {
        super();
    }

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}
class HouseRabbit4 extends Rabbit5 {
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit3  extends Rabbit5 {
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다");
    }
}
public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit4 hRabbit5 = new HouseRabbit4();
        MountainRabbit3 mRabbit5 = new MountainRabbit3();

        hRabbit5.sleep();
        mRabbit5.sleep();
    }
}

class Rabbit4 {
    int xPos;
    int yPos;

    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

class HouseRabbit3 extends Rabbit4 {
    void move(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        if (this.xPos > 100)
            this.xPos = 100;
        if (this.yPos > 100)
            this.yPos = 100;
    }
}

class MountainRabbit2 extends Rabbit4 {

}

public class Code08_06 {
    public Code08_06() {
        super();
    }

    public static void main(String[] args) {
        HouseRabbit3 hRabbit4 = new HouseRabbit3();
        MountainRabbit2 mRabbit4 = new MountainRabbit2();

        hRabbit4.move(500, 500);
        mRabbit4.move(500, 500);

        System.out.printf("집토끼 위치 : (%d, %d \n", hRabbit4.xPos, hRabbit4.yPos);
        System.out.printf("산토끼 위치 : (%d, %d \n", mRabbit4.xPos, hRabbit4.yPos);

    }
}

class Rabbit2 {
    String shape;
    int xPos;
    int yPos;

    void move(int x, int y) {
       this.xPos = x;
       this.yPos = y;
    }
}

class HouseRabbit extends Rabbit2 {
    String owner;
    void eatFeed() {
        System.out.println("집토끼가 풀을 먹습니다.");
    }
}

class MountainRabbit extends Rabbit2 {
    String mountain;
    void eatWildgrass() {
        System.out.println("산토끼가 풀을 먹습나다.");
    }
}
public class Code08_03 {
    public static void main(String[] args) {
        HouseRabbit hRabbit2 = new HouseRabbit();
        MountainRabbit mRabbit2 = new MountainRabbit();

        hRabbit2.shape = "삼각형";
        hRabbit2.owner = "난생이";
        hRabbit2.move(100, 100);
        hRabbit2.eatFeed();

        mRabbit2.shape = "네모";
        mRabbit2.mountain = "설악산";
        mRabbit2.move(2000, 200);
        mRabbit2.eatWildgrass();
    }
}

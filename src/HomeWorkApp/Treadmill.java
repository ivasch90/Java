package HomeWorkApp;

public class Treadmill implements Obstacles{
    final int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean passing(Entity entity) {
        return entity.run(getLength());
    }
}

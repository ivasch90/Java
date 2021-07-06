package HomeWorkApp;

public class Wall implements Obstacles{
    final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean passing(Entity entity) {
        return entity.jump(getHeight());
    }
}

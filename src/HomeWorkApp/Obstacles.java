package HomeWorkApp;


public interface Obstacles {
    default boolean passing(Entity entity) {
         return false;

     }
}

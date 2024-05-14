package Interface;
public interface Roll {
    default void roll() {
        System.out.println("Rolling...");
    }

}

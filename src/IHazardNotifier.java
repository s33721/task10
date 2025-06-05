public interface IHazardNotifier {
    default void notifyHazard(){
        System.out.println("This cargo is hazardous");
    }
}

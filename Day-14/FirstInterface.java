interface Playable {
    void play();
}
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar");
    }
}
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano");
    }
}

public class FirstInterface {
    public static void main(String[] args) {
                Playable playable = new Guitar();
                playable.play();
                Playable playable2 = new Piano();
                playable2.play();

    }
}

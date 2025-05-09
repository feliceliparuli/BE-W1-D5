public class Audio extends ElementoMultimediale {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        int i = 0;
        while (i < durata) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
            i++;
        }
    }
}

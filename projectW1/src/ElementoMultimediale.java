public abstract class ElementoMultimediale {
    private String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void show() {}

    public void play() {}
}

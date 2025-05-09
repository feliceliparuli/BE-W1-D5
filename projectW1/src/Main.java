import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci tipo (1=Audio, 2=Video, 3=Immagine):");
            int tipo = input.nextInt();
            input.nextLine();

            System.out.println("Titolo:");
            String titolo = input.nextLine();

            if (tipo == 1) {
                System.out.println("Durata:");
                int durata = input.nextInt();
                System.out.println("Volume:");
                int volume = input.nextInt();
                elementi[i] = new Audio(titolo, durata, volume);
            } else if (tipo == 2) {
                System.out.println("Durata:");
                int durata = input.nextInt();
                System.out.println("Volume:");
                int volume = input.nextInt();
                System.out.println("Luminosità:");
                int luminosita = input.nextInt();
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            } else if (tipo == 3) {
                System.out.println("Luminosità:");
                int luminosita = input.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);
            }
        }

        int scelta;
        do {
            System.out.println("Scegli un elemento da eseguire (1-5), 0 per uscire:");
            scelta = input.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Immagine) {
                    elemento.show();
                } else {
                    elemento.play();
                }
            }
        } while (scelta != 0);

        input.close();
    }
}

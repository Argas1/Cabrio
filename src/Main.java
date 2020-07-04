
public class Main {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("BMW", "M5");
        cabrio.setMove(true);
        cabrio.setOpen(false);
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s\n", cabrio.isMove(), cabrio.isOpen());
        cabrio.setMove(false);
        cabrio.setOpen(true);
        System.out.printf("Status samochodu. W ruchu: %s, Dach otwarty: %s", cabrio.isMove(), cabrio.isOpen());
    }

}

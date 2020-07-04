public class Cabrio {
    private String mark;
    private String name;
    private boolean isMove;
    private boolean isOpen;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMove() {
        return isMove;
    }

    public void setMove(boolean move) {
        isMove = move;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        if(isMove == true) {
            System.out.println("nie można otworzyć dachu, gdyż samochód jest w ruchu");
        }
        else this.isOpen = open;

    }

    public Cabrio(String mark, String name) {
        this.mark = mark;
        this.name = name;
    }
}

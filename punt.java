public class punt {
    private int ID;
    private int x;
    private int y;

    public punt(int ID, int x, int y){
        this.ID = ID;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punt {" +
                "ID=" + ID +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}

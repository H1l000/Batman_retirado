public class linia {
    private int id;
    private punt p1;
    private punt p2;

    public linia(int id, punt p1, punt p2){
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Linia {" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}

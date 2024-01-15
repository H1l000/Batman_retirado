public class area {
    private int id;
    private punt p1;
    private punt p2;
    private punt p3;

    public area(int id, punt p1, punt p2, punt p3){
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Area {" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }

}

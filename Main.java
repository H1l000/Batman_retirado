public class Main {
    public static void main(String[] args) {
        punt p1 = new punt(1, 4, 9);
        punt p2 = new punt(2, 7, 11);
        punt p3 = new punt(3, 2, 8);

        linia l1 = new linia(101, p1, p2);
        area a1 = new area(201, p1, p2, p3);

        // Mostrar información
        System.out.println("Punt 1: " + p1);
        System.out.println("Punt 2: " + p2);
        System.out.println("Punt 3: " + p3);
        System.out.println("Linia 1: " + l1);
        System.out.println("Area 1: " + a1);
    }
}

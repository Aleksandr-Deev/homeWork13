package homeWork13;

public class Main {
    public static void main(String[] args) {
        Author alexanderPushkin = new Author("Alexander", "Pushkin");
        Author sergeyYesenin = new Author("Sergey", "Yesenin");

        Book warAndPeace = new Book("warAndPeace", alexanderPushkin, 1863);
        Book rowanFire = new Book("rowanFire", sergeyYesenin, 1924);

        rowanFire.setYearOfPublication(1968);
    }
}
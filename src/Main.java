public class Main {
    private Author author;
    private String name;
    private int yearPublish;
    public static void main(String[] args) {
        Author brainBacks = new Author("Brain", "Backs");
        Author brainRed = new Author("Brain", "Red");
        Author dolevFarhi = new Author("Dolev", "Farhi");
        Author alexRobachevsky = new Author("Alex", "Robachevsky");

        Book book1 = new Book(brainBacks , "Black Hat", 2020);
        System.out.println("book1.getAuthorName() = " + book1.getAuthorName());
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getYearPublish() = " + book1.getYearPublish());
        System.out.println("");

        Book book2 = new Book(brainRed , "Red Hat", 2023);
        System.out.println("book2.getAuthorName() = " + book2.getAuthorName());
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getYearPublish() = " + book2.getYearPublish());
        System.out.println("");

        Book book3 = new Book(dolevFarhi, "Black Hat Bash ", 2023);
        System.out.println("book3.getAuthorName() = " + book3.getAuthorName());
        System.out.println("book3.getName() = " + book3.getName());
        System.out.println("book3.getYearPublish() = " + book3.getYearPublish());
        System.out.println("");


        Author author1 = new Author("Alex ", "Robachevsky ");
        System.out.println("author1.getFirstName() = " + alexRobachevsky.getFirstName());
        System.out.println("author1.getLastName() = " + alexRobachevsky.getLastName());
        System.out.println("author2 = " + dolevFarhi);
        System.out.println("");

        System.out.println("");

        book3.setYearPublish(2024);
        System.out.println("book3.getYearPublish() = " + book3.getYearPublish());

    }
}

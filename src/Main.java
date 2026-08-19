public class Main {
    String Author;
    String name;
    int yearPublish;
    public static void main(String[] args) {
        App book1 = new App("Brain Backs ", "Black Hat ", 2020);
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());
        System.out.println("book1.getYearPublish() = " + book1.getYearPublish());
        System.out.println("");

        App book2 = new App("Brain Red ", "Red Hat ", 2023);
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getYearPublish() = " + book2.getYearPublish());
        System.out.println("");

        App book3 = new App("Dolev Farhi ", "Blach Hat Bash ", 2023);
        System.out.println("book3.getName() = " + book3.getName());
        System.out.println("book3.getAuthor() = " + book3.getAuthor());
        System.out.println("book3.getYearPublish() = " + book3.getYearPublish());
        System.out.println("");


        Author author1 = new Author("Alex ", "Robachevsky ");
        System.out.println("author1.getFirstName() = " + author1.getFirstName());
        System.out.println("author1.getLastName() = " + author1.getLastName());

        Author author2 = new Author("Dolev ","Farhi ");
        System.out.println("author2 = " + author2);
        System.out.println("");

        book3.setYearPublish(2024);
        System.out.println("book3.getYearPublish() = " + book3.getYearPublish());

    }
}
